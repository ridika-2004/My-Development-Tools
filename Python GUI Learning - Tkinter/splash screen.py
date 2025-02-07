from tkinter import *

# widgets = buttons, labels, radio buttons, text boxes, images etc
# windows = serves as a container to hold those widgets

window = Tk() # creates a blank window
window.title("Splash screen in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

# Create a headline label
headline_label = Label(window, text="It's a splash screen!", font=("Arial", 24), fg="#000000")
headline_label.pack(pady=10)

splash_window = Tk()
splash_window.title("Splash Screen")
splash_window.geometry("300x200")

# def close_splash():
#     splash_window.destroy()

# Set a timer to close the splash window after 3 seconds
splash_window.after(3000, splash_window.destroy)

window.mainloop() # places the window on the screen