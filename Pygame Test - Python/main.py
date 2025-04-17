import pygame

# setup
pygame.init()
width = 600
height = 400
screen = pygame.display.set_mode((width,height))
clock = pygame.time.Clock()
running = True
dt = 0

player_pos = pygame.Vector2(width/2, height/2)

# main loop
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    screen.fill("purple")
    pygame.draw.circle(screen, "red", player_pos, 30)

    key = pygame.key.get_pressed()

    if key[pygame.K_w]:
        player_pos.y -= 500 * dt
    if key[pygame.K_s]:
        player_pos.y += 500 * dt
    if key[pygame.K_a]:
        player_pos.x -= 500 * dt
    if key[pygame.K_d]:
        player_pos.x += 500 * dt

    pygame.display.flip()

    dt = clock.tick(60)/1000

pygame.quit()