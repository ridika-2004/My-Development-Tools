#include <iostream>
#include <raylib.h>
using namespace std;

class Ball{
    public:
    int x,y,velocity;
    float size;
};

class Platform{
    public:
    int x,y,width,height;
};
int ball_on_platform(Ball ball,Platform platforms[]){
    int count = 3;
    for(int i=0;i<count;i++){
        Vector2 ball_position = {.x = ball.x, .y=ball.y};
        Rectangle platform_rec = {.x = platforms[i].x, .y = platforms[i].y,
        .width = platforms[i].width, .height = platforms[i].height};
        if(CheckCollisionCircleRec(ball_position, ball.size, platform_rec)){
            return 1;
        }
    }
    return 0;
}

int main(){
    int window_height = 600,window_width =800;
    int gravity =3;
    Ball ball;
    Platform platforms[3];
    ball.x= window_width/2, ball.y = window_height/2,ball.size = 40.0,ball.velocity=4;
    platforms[0].x = 0;
    platforms[0].y = window_height-10;
    platforms[0].width = window_width;
    platforms[0].height = 10;

    platforms[1].x = abs(window_width*0.1);
    platforms[1].y = abs(window_height*0.7);
    platforms[1].width = abs(window_width*0.3);
    platforms[1].height = abs(window_height*0.05);

    platforms[2].x = abs(window_width*0.3);
    platforms[2].y = abs(window_height*0.5);
    platforms[2].width = abs(window_width*0.3);
    platforms[2].height = abs(window_height*0.05);

    SetTargetFPS(60);
    InitWindow(window_width,window_height,"Bouncing Ball");

    while(!WindowShouldClose()){
        BeginDrawing();

        if(ball_on_platform(ball,platforms)){
            ball.velocity=0;
            //ball.y = window_height - ball.size;

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

        int count = sizeof(platforms)/sizeof(Platform);
        for(int i=0;i<count;i++){
            DrawRectangle(
                platforms[i].x,
                platforms[i].y,
                platforms[i].width,
                platforms[i].height,
                DARKBROWN);
        }

        
        DrawCircle(ball.x,ball.y,ball.size,RED);

        EndDrawing();
    }
    return 0;
}