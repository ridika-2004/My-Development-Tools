from tkinter import *
from PIL import Image, ImageTk

def moveup(event):
    canvas.move(myimage,0,-10)

def movedown(event):
    canvas.move(myimage,0,10)

def moveleft(event):
    canvas.move(myimage,-10,0)

def moveright(event):
    canvas.move(myimage,10,0)

window = Tk() # creates a blank window
window.title("Moving images in python") # sets the title of the window
# window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

canvas = Canvas(window,height=500,width=500)
canvas.pack()

window.bind("<w>",moveup)
window.bind("<s>",movedown)
window.bind("<a>",moveleft)
window.bind("<d>",moveright)
window.bind("<Up>",moveup)
window.bind("<Down>",movedown)
window.bind("<Left>",moveleft)
window.bind("<Right>",moveright)

car_image = Image.open("car.png")
car_image = car_image.resize((112, 67))
car = ImageTk.PhotoImage(car_image)
myimage = canvas.create_image(10,10,image=car,anchor=NW)

window.mainloop() # places the window on the screen