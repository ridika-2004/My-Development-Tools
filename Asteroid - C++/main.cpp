#include <iostream>
#include <raylib.h>
#define min 5
#define max 240
using namespace std;

typedef enum Asteroidsize{
    SMALL=1,
    MEDIUM=2,
    LARGE=4,
}Asteroidsize;

typedef struct Asteroid
{
    bool active;
    Vector2 position,velocity;
    Asteroidsize size;
    float rotation,rotationspeed;
}Asteroid;

Asteroid createasterioid(Vector2 position, Vector2 velocity, Asteroidsize size){
    Asteroid asteroid = {
        .active = true,
        .position = position,
        .velocity = velocity,
        .size = size,
        .rotation = rand()%360,
        .rotationspeed = GetRandomValue(min,max);
    }
}
int main() {
    
    return 0;
}
