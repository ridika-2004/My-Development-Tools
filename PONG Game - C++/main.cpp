#include <iostream>
#include <raylib.h>

using namespace std;

int playerScore =0, cpuScore =0;

class Ball{
    public:
    float x,y; // co-ordinates of ball
    int speedX,speedY;
    float radius;

    void draw(){
        DrawCircle(x,y,radius, WHITE); // DrawCircle(centerX, centerY,radius,color)
    }

    void move(){
        x+=speedX;
        y+=speedY;

        if(y+radius>=GetScreenHeight() || y-radius<=0){
            speedY *= -1;
        }
        if(x+radius>=GetScreenWidth()){
            cpuScore++;
            resetBall();
        } 
        if(x-radius<=0){
            playerScore++;
            resetBall();
        }
    }

    void resetBall(){
        x = GetScreenWidth()/2;
        y = GetScreenHeight()/2;

        int speedChoices[2] = {-1,1};
        speedX*= speedChoices[GetRandomValue(0,1)];
        speedY*= speedChoices[GetRandomValue(0,1)];

    }
};

class Paddle{
    protected:
    void limitMove(){
        if(y<=0){
            y= 0;
        }
        if(y+height>=GetScreenHeight()){
            y = GetScreenHeight() - height;
        }
    }

    public:
    float x,y;
    float width,height;
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
        limitMove();
    }
};

class CpuPaddle : public Paddle{
    public:

    void move(int ballY){
        if(y+ (height/2)> ballY){
            y = y-speed;
        }
        if(y+ (height/2) <= ballY){
            y = y + speed;
        }
        limitMove();
    }    
};

Ball ball;
Paddle player;
CpuPaddle cpu;

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

    cpu.height = 120;
    cpu.width = 25;
    cpu.x = 10;
    cpu.y = height/2 - 60;
    cpu.speed =6;

    while (WindowShouldClose()==false) //game loop will continue untill escape key or close icon is pressed
    {
        BeginDrawing();

        // moving
        ball.move();
        player.move();
        cpu.move(ball.y);

        // checking for collisions
        if(CheckCollisionCircleRec(Vector2{ball.x, ball.y},ball.radius, Rectangle{player.x, player.y, player.width, player.height})){
            ball.speedX*= -1;
        }
        if(CheckCollisionCircleRec(Vector2{ball.x, ball.y},ball.radius, Rectangle{cpu.x, cpu.y, cpu.width, cpu.height})){
            ball.speedX*= -1;
        }

        //drawing
        ClearBackground(BLACK); // clearBackground(color)

        DrawLine(540,0,540,720,WHITE); // DrawLine(startX,startY,endX,endY,color)

        ball.draw();
        cpu.draw();
        player.draw();

        DrawText(TextFormat("%i", cpuScore),width/4 -20,20,80,WHITE); // DrawText(text,xpos,ypos,fontsize,color)
        DrawText(TextFormat("%i", playerScore),3*width/4 -20,20,80,WHITE);

        EndDrawing();
    }
    

    CloseWindow();
    return 0;
}