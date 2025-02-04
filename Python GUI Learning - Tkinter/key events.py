from tkinter import *

def dosomething(event):
    # print("I know which key you pressed. :]. You pressed "+ event.keysym)
    keylabel.config(text=("I know which key you pressed. :]. You pressed "+ event.keysym))

window = Tk() # creates a blank window
window.title("Key events in python") # sets the title of the window
# window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

# Create a headline label
headline_label = Label(window, text="Hit a key!", font=("Arial", 24), fg="#000000")
headline_label.pack(pady=10)

window.bind("<Key>",dosomething)

keylabel = Label(window,font=("Arial",20))
keylabel.pack()

window.mainloop() # places the window on the screen