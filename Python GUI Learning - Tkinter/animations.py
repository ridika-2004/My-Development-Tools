from tkinter import *
import time

window = Tk() # creates a blank window
window.title("Fly me to the moon") # sets the title of the window
# window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

width = window.winfo_screenwidth()
height =window.winfo_screenheight()
velocityx =3
velocityy=3

canvas = Canvas(window,width=width,height=height)
canvas.pack()

bg_photo = PhotoImage(file="earth.png")
earth = canvas.create_image(0,0,image=bg_photo,anchor=NW)

photo = PhotoImage(file="Astronaut.png")
astronaut = canvas.create_image(0,0,image=photo,anchor=NW)

while True:
    coordinates = canvas.coords(astronaut)
    print(coordinates)
    if(coordinates[0]+photo.width()>=width or coordinates[0]<0):
        velocityx = velocityx*-1

    if(coordinates[1]+photo.height()>=height-30 or coordinates[1]<0):
        velocityy = velocityy*-1
        
    canvas.move(astronaut,velocityx,velocityy)
    window.update()
    time.sleep(0.01)

window.mainloop() # places the window on the screen