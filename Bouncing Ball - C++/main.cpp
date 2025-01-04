#include <iostream>
#include <raylib.h>
#include <vector>
using namespace std;

class Ball {
public:
    float x, y, velocity;
    float size;
};

class Platform {
public:
    float x, y, width, height;
};

float rand_float() {
    return static_cast<float>(rand()) / static_cast<float>(RAND_MAX);
}

int ball_on_platform(Ball ball, const vector<Platform>& platforms) {
    for (int i = 0; i < platforms.size(); i++) {
        Rectangle platform_rec = {platforms[i].x, platforms[i].y, platforms[i].width, platforms[i].height};
        Rectangle ball_rec = {ball.x - ball.size + 10, ball.y + ball.size / 2, ball.size * 2 - 20, ball.size / 2 + 1};
        if (CheckCollisionRecs(ball_rec, platform_rec)) {
            return i;
        }
    }
    return -1;
}

void reset_game(Ball& ball, vector<Platform>& platforms, int window_width, int window_height) {
    // Reset ball position and velocity
    ball.x = window_width / 2;
    ball.y = window_height / 2;
    ball.size = 40.0;
    ball.velocity = 4;

    // Reset platforms
    platforms.clear();
    platforms.push_back({0, window_height - 10, window_width, 10}); // ground platform

    platforms.push_back({window_width * 0.1, window_height * 0.7, window_width * 0.3, window_height * 0.05});
    platforms.push_back({window_width * 0.3, window_height * 0.5, window_width * 0.3, window_height * 0.05});
}

void add_new_platform(vector<Platform>& platforms, int window_width, int window_height) {
    float platform_width = window_width * 0.3;
    float platform_spacing = 0.2 * window_width;
    
    float platform_x = platforms.back().x + platforms.back().width + platform_spacing;
    if (platform_x > window_width * 10) {
        platform_x = 0;  // Reset to beginning if too far right

        // Remove platforms that are out of the view range
        platforms.erase(platforms.begin(), platforms.begin() + 1);
    }

    float platform_y = window_height * 0.2 + rand_float() * (window_height * 0.6);
    platforms.push_back({platform_x, platform_y, platform_width, window_height * 0.05});
}

int main() {
    int window_height = 600, window_width = 800;
    int gravity = 3;

    Camera2D camera = {
        {window_width / 2.0f, window_height / 2.0f}, // offset (center of the screen)
        {window_width / 2.0f, window_height / 2.0f}, // target (initially at ball position)
        0.0f,                                       // rotation
        1.0f                                        // zoom
    };

    Ball ball;
    vector<Platform> platforms;
    reset_game(ball, platforms, window_width, window_height);

    InitWindow(window_width, window_height, "Bouncing Ball");
    SetTargetFPS(60);

    bool game_over = false;

    while (!WindowShouldClose()) {
        if (game_over) {
            // Game over screen
            BeginDrawing();
            ClearBackground(RAYWHITE);
            DrawText("GAME OVER! Press SPACE to Restart", 200, window_height / 2, 20, RED);
            EndDrawing();

            // Restart the game when space is pressed
            if (IsKeyPressed(KEY_SPACE)) {
                game_over = false;
                reset_game(ball, platforms, window_width, window_height);
            }
            continue;
        }

        // Update ball physics
        ball.y += ball.velocity;
        ball.velocity += gravity;

        int current_platform = ball_on_platform(ball, platforms);

        if (current_platform != -1) {
            if (ball.velocity > 0) {
                ball.y = platforms[current_platform].y - ball.size;
                ball.velocity = 0;
            }

            if (IsKeyPressed(KEY_SPACE)) {
                ball.velocity = -30;
            }
        }

        if (IsKeyDown(KEY_LEFT)) {
            ball.x -= 4;
        }
        if (IsKeyDown(KEY_RIGHT)) {
            ball.x += 4;
        }

        // Check for game over (ball falls below screen)
        if (ball.y > window_height) {
            game_over = true;
        }

        // Add new platform as ball moves to the right
        if (platforms.back().x + platforms.back().width < ball.x) {
            add_new_platform(platforms, window_width, window_height);
        }

        // Update camera to follow the ball
        camera.target = {ball.x, ball.y};

        BeginDrawing();
        ClearBackground(RAYWHITE);

        BeginMode2D(camera);

        // Draw platforms
        for (int i = 0; i < platforms.size(); i++) {
            DrawRectangle(
                platforms[i].x,
                platforms[i].y,
                platforms[i].width,
                platforms[i].height,
                DARKBROWN);
        }

        // Draw the ball
        DrawCircle(ball.x, ball.y, ball.size, RED);

        EndMode2D();
        EndDrawing();
    }

    CloseWindow();
    return 0;
}
