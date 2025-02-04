from tkinter import *

def open_window():
    new_window = Tk()
    new_window.geometry("420x320")

    window.destroy() # destrying old window

window = Tk() # creates a blank window
window.title("Opening new window in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

# Create a headline label
headline_label = Label(window, text="Open a new window!", font=("Arial", 24), fg="#000000")
headline_label.pack(pady=10)

Button(window,text="Open",command=open_window).pack()

window.mainloop() # places the window on the screen