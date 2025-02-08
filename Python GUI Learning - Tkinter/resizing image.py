from tkinter import *
from PIL import Image, ImageTk

window = Tk() # creates a blank window
window.title("resize image in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

photo = Image.open("earth.png")
resized = photo.resize((500, 500), Image.LANCZOS) # use Image.LANCZOS instead of Image.ANTIALIAS

new_photo = ImageTk.PhotoImage(resized)

# Create a headline label
headline_label = Label(window, image=new_photo, font=("Arial", 24), fg="#000000", height=500, width=500)
headline_label.pack(pady=10)

window.mainloop() # places the window on the screen