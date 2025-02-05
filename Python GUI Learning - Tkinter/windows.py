from tkinter import *

# widgets = buttons, labels, radio buttons, text boxes, images etc
# windows = serves as a container to hold those widgets

window = Tk() # creates a blank window
window.title("My First GUI Program in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window
window.config(bg="#ffffdd") # sets the background color of the window

# Create a headline label
headline_label = Label(window, text="Welcome to My GUI!", font=("Arial", 24), bg="#ffffdd", fg="#000000")
headline_label.pack(pady=10)

window.mainloop() # places the window on the screen