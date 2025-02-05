from tkinter import *
from tkinter import colorchooser

def click():
    color = colorchooser.askcolor()
    # print(color)
    colorrgb = color[0]
    colorhex = color[1]
    # print("rgb : ", colorrgb)
    # print("hex : ", colorhex)
    window.config(bg=colorhex)

window = Tk()
window.title("This is color chooser in python") # sets the title of the window
window.geometry("420x420")
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

button = Button(text="click",command=click)
button.pack()

window.mainloop()