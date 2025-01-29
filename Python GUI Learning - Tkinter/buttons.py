from tkinter import *

# button = we can click it!

def click():
    print("You clicked the cat!")

window = Tk() # creates a blank window
window.title("Click the cat!") # sets the window title

icon = PhotoImage(file="cat.png") # creates a photo object

button = Button(window,
                text="Click the cat!",
                command=click,
                font=("Arial Bold", 40),
                bg = "black",
                fg = "green",
                state=ACTIVE,
                activebackground="black",
                activeforeground="green",
                image=icon,
                compound='bottom') # creates a button

button.pack() # places the button on the window

window.mainloop() # places the window on the screen