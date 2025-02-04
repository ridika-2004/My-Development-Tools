from tkinter import *
from PIL import Image, ImageTk

def moveup(event):
    label.place(x=label.winfo_x(),y=label.winfo_y()-10)

def movedown(event):
    label.place(x=label.winfo_x(),y=label.winfo_y()+10)

def moveleft(event):
    label.place(x=label.winfo_x()-10,y=label.winfo_y())

def moveright(event):
    label.place(x=label.winfo_x()+10,y=label.winfo_y())

window = Tk() # creates a blank window
window.title("Moving images in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

headline_label = Label(window, text="Lessgo!", font=("Arial", 12), fg="#000000")
headline_label.pack(pady=10)

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
label = Label(window,image=car)
label.place(x=0,y=30)

window.mainloop() # places the window on the screen