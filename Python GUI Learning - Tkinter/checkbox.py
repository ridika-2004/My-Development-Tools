from tkinter import *

def display():
    if (x.get()==1):
        print("Correct")
    else:
        print("You're dumb :(")

window = Tk() # creates a blank window
window.title("Tick the checkbox") # sets the title of the window
window.geometry("500x500") # sets the size of the window

icon = PhotoImage(file="panic.png") # creates a photo image object

x = IntVar()

checkbutton = Checkbutton(window,
                          text="Yes?",
                          variable=x,
                          onvalue=1,
                          offvalue=0,
                          font=("Arial Bold", 50),
                          fg="navy blue",
                          bg="white",
                          activebackground="#aaaaaa",
                          activeforeground="navy blue",
                          command=display,
                          image=icon,
                          compound='top') # creates a checkbox

checkbutton.pack() # places the checkbox on the window

window.mainloop() # places the window on the screen