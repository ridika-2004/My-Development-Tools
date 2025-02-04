from tkinter import *

window = Tk() # creates a blank window
window.title("Canvas in python") # sets the title of the window
# window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

canvas = Canvas(window,height=400,width=400)
canvas.create_line(50,50,400,400,fill="#ffddee",width=5)
canvas.create_line(0,400,400,0,fill="#ffddee",width=5)
canvas.create_rectangle(100,100,300,300,
                        fill="green",
                        outline="") # means no stroke
canvas.create_arc(0,0,400,400,style=PIESLICE,fill="Red",start=180,extent=120)
canvas.pack()


window.mainloop() # places the window on the screen