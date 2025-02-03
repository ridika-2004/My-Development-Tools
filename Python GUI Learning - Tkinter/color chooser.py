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
window.geometry("420x420")

button = Button(text="click",command=click)
button.pack()

window.mainloop()