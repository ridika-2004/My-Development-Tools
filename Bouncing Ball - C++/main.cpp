#include <iostream>
#include <raylib.h>
using namespace std;

class Ball{
    public:
    float x,y,velocity;
    float size;
};

class Platform{
    public:
    float x,y,width,height;
};
int ball_on_platform(Ball ball,Platform platforms[], int count){
    for(int i=0;i<count;i++){
        Rectangle platform_rec = {.x = platforms[i].x, 
                                  .y = platforms[i].y,
                                  .width = platforms[i].width, 
                                  .height = platforms[i].height};
        Rectangle ball_rec = {.x = ball.x-ball.size + 10, 
                                   .y=ball.y+ball.size/2,
                                   .width = ball.size*2 -20,
                                   .height = ball.size/2+1,  
                                   };
        if(CheckCollisionRecs(ball_rec, platform_rec)){
            return i;
        }
    }
    return -1;
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

    int platform_count = sizeof(platforms)/sizeof(Platform);

    SetTargetFPS(60);
    InitWindow(window_width,window_height,"Bouncing Ball");

    while(!WindowShouldClose()){
        BeginDrawing();

        int current_platform = ball_on_platform(ball,platforms,platform_count);

        if(current_platform!=-1){
            if(ball.velocity>0){
                ball.y = platforms[current_platform].y - ball.size;
                ball.velocity=0;
            }
            
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

        for(int i=0;i<platform_count;i++){
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