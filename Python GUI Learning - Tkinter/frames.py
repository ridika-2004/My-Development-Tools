from tkinter import *

# frame = a rectangular container to group and hold widgets

def click(letter):
    print(f"{letter}")

window = Tk() # creates a blank window
window.title("Frames in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

# Create a headline label
headline_label = Label(window, text="Write my name!", font=("Arial", 24), fg="#000000")
headline_label.pack(pady=10)

frame = Frame(window)
frame.pack()

Button(frame,text="R",font=("Helvetica",15),command=lambda : click("R")).pack(side=LEFT)
Button(frame,text="I",font=("Helvetica",15),command=lambda : click('I')).pack(side=LEFT)
Button(frame,text="D",font=("Helvetica",15),command=lambda : click("D")).pack(side=LEFT)
Button(frame,text="K",font=("Helvetica",15),command=lambda : click("K")).pack(side=LEFT)
Button(frame,text="A",font=("Helvetica",15),command=lambda : click("A")).pack(side=LEFT)

window.mainloop() # places the window on the screen