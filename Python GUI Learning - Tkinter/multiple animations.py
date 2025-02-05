from tkinter import *
import time
from ball import *

window = Tk() # creates a blank window
window.title("I like to move it move it") # sets the title of the window
# window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

width = window.winfo_screenwidth()
height =window.winfo_screenheight()
velocityx =2
velocityy=1

canvas = Canvas(window,width=width,height=height)
canvas.pack()

ball1 = ball(canvas,0,0,100,2,3,"white")
ball2 = ball(canvas,0,0,70,4,3,"orange")
ball3 = ball(canvas,0,0,120,2,5,"black")
ball4 = ball(canvas,0,0,100,2,4,"red")
ball5 = ball(canvas,0,0,100,3,5,"white")
ball6 = ball(canvas,0,0,70,4,4,"orange")
ball7 = ball(canvas,0,0,120,5,2,"black")
ball8 = ball(canvas,0,0,100,3,2,"red")
ball9 = ball(canvas,0,0,70,5,3,"orange")
ball10 = ball(canvas,0,0,70,6,4,"orange")


while True:
        
    ball1.move()
    ball2.move()
    ball3.move()
    ball4.move()
    ball5.move()
    ball6.move()
    ball7.move()
    ball8.move()
    ball9.move()
    ball10.move()
    window.update()
    time.sleep(0.01)

window.mainloop() # places the window on the screen