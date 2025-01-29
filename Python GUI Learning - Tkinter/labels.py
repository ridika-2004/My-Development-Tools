from tkinter import *

# label = an area widget that holds text and/or an image within a window

window = Tk() # creates a blank window

icon = PhotoImage(file="nobita.png") # creates a photo image object

label = Label(window,
              text="Me watching others codes",
              font=("Arial Bold", 40),
              fg="black",
              relief=None,
              bd=0,
              padx=0,
              pady=0,
              image=icon,
              compound='top') # creates a label widget
label.pack() # adds the label to the window
# label.place(x=10,y=0)

window.mainloop() # places the window on the screen