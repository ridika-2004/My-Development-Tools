#include<iostream>
#include <raylib.h>

// Constants for grid size and tile size
const int TILE_SIZE = 40;
const int GRID_WIDTH = 11;
const int GRID_HEIGHT = 10;

// Maze layout
const char maze[GRID_HEIGHT][GRID_WIDTH] = {
    "##########",
    "#S....T..#",
    "#..###...#",
    "#..#..#$E#",
    "#..#.....#",
    "##########"
};

int main() {
    // Initialize Raylib window
    InitWindow(GRID_WIDTH * TILE_SIZE, GRID_HEIGHT * TILE_SIZE, "Maze Escape");
    SetTargetFPS(60);

    // Player position
    int playerX = 1, playerY = 1;

    // Main game loop
    while (!WindowShouldClose()) {
        // Handle player movement
        if (IsKeyPressed(KEY_W) && maze[playerY - 1][playerX] != '#') playerY--;
        if (IsKeyPressed(KEY_S) && maze[playerY + 1][playerX] != '#') playerY++;
        if (IsKeyPressed(KEY_A) && maze[playerY][playerX - 1] != '#') playerX--;
        if (IsKeyPressed(KEY_D) && maze[playerY][playerX + 1] != '#') playerX++;

        // Drawing
        BeginDrawing();
        ClearBackground(RAYWHITE);

        // Draw maze
        for (int y = 0; y < GRID_HEIGHT; y++) {
            for (int x = 0; x < GRID_WIDTH; x++) {
                if (maze[y][x] == '#') {
                    DrawRectangle(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE, DARKGRAY);
                } else if (maze[y][x] == 'T') {
                    DrawCircle(x * TILE_SIZE + TILE_SIZE / 2, y * TILE_SIZE + TILE_SIZE / 2, TILE_SIZE / 4, RED);
                } else if (maze[y][x] == '$') {
                    DrawCircle(x * TILE_SIZE + TILE_SIZE / 2, y * TILE_SIZE + TILE_SIZE / 2, TILE_SIZE / 4, GOLD);
                } else if (maze[y][x] == 'E') {
                    DrawRectangle(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE, GREEN);
                }
            }
        }

        // Draw player
        DrawCircle(playerX * TILE_SIZE + TILE_SIZE / 2, playerY * TILE_SIZE + TILE_SIZE / 2, TILE_SIZE / 3, BLUE);

        EndDrawing();
    }

    CloseWindow(); // Close Raylib window
    return 0;
}
