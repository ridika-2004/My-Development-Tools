from ursina import *

app = Ursina()

# Create a rotating cube
cube = Entity(model='cube', color=color.azure, scale=(1.5, 1.5, 1.5), position=(0, 0, 0))

# Update function to animate the cube
def update():
    cube.rotation_y += 50 * time.dt  # rotate around Y-axis
    cube.rotation_x += 50 * time.dt   # slight X-axis rotation

app.run()
