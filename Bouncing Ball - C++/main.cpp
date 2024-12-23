#include <iostream>
#include <raylib.h>
using namespace std;

class Ball{
    public:
    int x,y,velocity;
    float size;
};

int ball_on_ground(Ball ball,int window_height){
    if(ball.y>=window_height-ball.size){
        return 1;
    }
    return 0;
}

int main(){
    int window_height = 600,window_width =800;
    int gravity =3;
    Ball ball;
    ball.x= window_width/2, ball.y = window_height/2,ball.size = 40.0,ball.velocity=4;
    SetTargetFPS(60);
    InitWindow(window_width,window_height,"Bouncing Ball");

    while(!WindowShouldClose()){
        BeginDrawing();

        if(ball_on_ground(ball,window_height)){
            ball.velocity=0;
            ball.y = window_height - ball.size;

            if(IsKeyPressed(KEY_SPACE)){
                ball.velocity = -30;
            }
        }
        if(IsKeyDown(KEY_LEFT)){
            ball.x-=4;
        }
        if(IsKeyDown(KEY_RIGHT)){
            ball.x+=4;
        }
        ball.y+=ball.velocity;
        ball.velocity+=gravity;

        ClearBackground(RAYWHITE);

        DrawRectangle(abs(window_width*0.1), abs(window_height*0.7),abs(window_width*0.2),abs(window_height*0.05),DARKBROWN);
        //ass
        DrawCircle(ball.x,ball.y,ball.size,RED);

        EndDrawing();
    }
    return 0;
}