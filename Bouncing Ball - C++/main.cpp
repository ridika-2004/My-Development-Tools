#include <iostream>
#include <raylib.h>
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

int ball_on_platform(Ball ball, Platform platforms[], int count) {
    for (int i = 0; i < count; i++) {
        Rectangle platform_rec = {platforms[i].x, platforms[i].y, platforms[i].width, platforms[i].height};
        Rectangle ball_rec = {ball.x - ball.size + 10, ball.y + ball.size / 2, ball.size * 2 - 20, ball.size / 2 + 1};
        if (CheckCollisionRecs(ball_rec, platform_rec)) {
            return i;
        }
    }
    return -1;
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
    int platform_width = abs(window_width*0.3);
    int world_width = window_width*10;
    int platform_count = world_width/(platform_width + 0.2*window_width);

    Ball ball;
    Platform platforms[platform_count+1];

    ball.x = window_width / 2;
    ball.y = window_height / 2;
    ball.size = 40.0;
    ball.velocity = 4;

    platforms[0].x = 0;
    platforms[0].y = window_height - 10;
    platforms[0].width = window_width;
    platforms[0].height = 10;

    platforms[1].x = window_width * 0.1;
    platforms[1].y = window_height * 0.7;
    platforms[1].width = window_width * 0.3;
    platforms[1].height = window_height * 0.05;

    platforms[2].x = window_width * 0.3;
    platforms[2].y = window_height * 0.5;
    platforms[2].width = window_width * 0.3;
    platforms[2].height = window_height * 0.05;

    //int platform_count = sizeof(platforms) / sizeof(Platform);

    InitWindow(window_width, window_height, "Bouncing Ball");
    SetTargetFPS(60);

    while (!WindowShouldClose()) {
        // Update ball physics
        ball.y += ball.velocity;
        ball.velocity += gravity;

        int current_platform = ball_on_platform(ball, platforms, platform_count);

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

        // Update camera to follow the ball
        camera.target = {ball.x, ball.y};

        BeginDrawing();
        ClearBackground(RAYWHITE);

        BeginMode2D(camera);

        // Draw platforms
        for (int i = 0; i < platform_count; i++) {
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
