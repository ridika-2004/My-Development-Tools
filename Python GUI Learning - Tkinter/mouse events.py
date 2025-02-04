from tkinter import *

def dosomething(event):
    # print("I know which key you pressed. :]")
    keylabel.config(text=("I know where your mouse is. :]. "+ str(event.x)+" , "+str(event.y)))

window = Tk() # creates a blank window
window.title("Mouse events in python") # sets the title of the window
# window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

# Create a headline label
headline_label = Label(window, text="Move your mouse!", font=("Arial", 24), fg="#000000")
headline_label.pack(pady=10)

window.bind("<Button-1>",dosomething) # left mouse click
# window.bind("<Button-2>",dosomething) # scroll
# window.bind("<Button-3>",dosomething) # right mouse
# window.bind("<ButtonRelease>",dosomething) # mouse release
# window.bind("<Motion>",dosomething) # mouse motion 

keylabel = Label(window,font=("Arial",20))
keylabel.pack()

window.mainloop() # places the window on the screen