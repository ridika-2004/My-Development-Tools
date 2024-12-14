#include <iostream>
#include <raylib.h>

using namespace std;

class Ball{
    public:
    double x,y; // co-ordinates of ball
    int speedX,speedY;
    int radius;

    void draw(){
        DrawCircle(x,y,radius, WHITE); // DrawCircle(centerX, centerY,radius,color)
    }

    void move(){
        x+=speedX;
        y+=speedY;
    }
};

Ball ball;

int main () {
    //cout<<"Starting the game"<<endl;
    const int width = 1080;
    const int height = 720;

    InitWindow(width, height, "PONG"); //InitWindow(width, height, "title") - initializes the screent
    SetTargetFPS(60); //frames per second

    ball.radius =20;
    ball.x = width/2;
    ball.y = height/2; // ball's center 
    ball.speedX = 7;
    ball.speedY = 7;

    while (WindowShouldClose()==false) //game loop will continue untill escape key or close icon is pressed
    {
        BeginDrawing();

        // moving
        ball.move();

        //drawing
        ClearBackground(BLACK); // clearBackground(color)
        ball.draw();
        DrawRectangle(5,310,25,100,WHITE); // DrawRectangle(posX, posY, width, height, color)
        DrawRectangle(1050,310,25,100,WHITE); // DrawRectangle(posX, posY, width, height, color)
        DrawLine(540,0,540,720,WHITE); // DrawLine(startX,startY,endX,endY,color)
        EndDrawing();
    }
    

    CloseWindow();
    return 0;
}