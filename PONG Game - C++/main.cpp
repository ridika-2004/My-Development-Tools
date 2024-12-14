#include <iostream>
#include <raylib.h>

using namespace std;

class Ball{
    public:
    int x,y; // co-ordinates of ball
    int speedX,speedY;
    int radius;

    void draw(){
        DrawCircle(x,y,radius, WHITE); // DrawCircle(centerX, centerY,radius,color)
    }

    void move(){
        x+=speedX;
        y+=speedY;

        if(y+radius>=GetScreenHeight() || y-radius<=0){
            speedY *= -1;
        }
        if(x+radius>=GetScreenWidth() || x-radius<=0){
            speedX *= -1;
        }
    }
};

class Paddle{
    public:
    double x,y;
    double width,height;
    int speed;

    void draw(){
        DrawRectangle(x,y,width,height,WHITE); // DrawRectangle(posX, posY, width, height, color)
    }

    void move(){
        if(IsKeyDown(KEY_UP)){
            y = y -speed;
        }
        if(IsKeyDown(KEY_DOWN)){
            y = y +speed;
        }
        if(y<=0){
            y= 0;
        }
        if(y+height>=GetScreenHeight()){
            y = GetScreenHeight() - height;
        }
    }
};

Ball ball;
Paddle player;

int main () {
    //cout<<"Starting the game"<<endl;
    const int width = 1080;
    const int height = 720;

    InitWindow(width, height, "PONG"); //InitWindow(width, height, "title") - initializes the screent
    SetTargetFPS(60); //frames per second

    // initialize ball
    ball.radius =20;
    ball.x = width/2;
    ball.y = height/2; // ball's center 
    ball.speedX = 7;
    ball.speedY = 7;

    //initialize player's paddle
    player.width =25;
    player.height =120;
    player.x = width-player.width-5;
    player.y = (height/2)-60;
    player.speed =6;

    while (WindowShouldClose()==false) //game loop will continue untill escape key or close icon is pressed
    {
        BeginDrawing();

        // moving
        ball.move();
        player.move();

        //drawing
        ClearBackground(BLACK); // clearBackground(color)

        DrawLine(540,0,540,720,WHITE); // DrawLine(startX,startY,endX,endY,color)

        ball.draw();
        
        DrawRectangle(5,height/2-60,25,120,WHITE); // DrawRectangle(posX, posY, width, height, color)

        player.draw();
        
        EndDrawing();
    }
    

    CloseWindow();
    return 0;
}