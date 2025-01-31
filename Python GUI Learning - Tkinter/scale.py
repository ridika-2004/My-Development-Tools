from tkinter import *

def submit():
    print("The temparature is "+str(scale.get())+ " degree")

window = Tk() # creates a blank window
window.title("Scaling in python") # sets the title of the window

hot = PhotoImage(file="hot.png")
hotlabel = Label(image=hot)
hotlabel.pack()

scale = Scale(window,
              from_=100, to=0,
              length=300,
              orient=VERTICAL, # sets the orientation of the scale
              font="Helvetica 12",
              tickinterval=10, # sets the interval of the scale
              showvalue=0, # hides the value of the scale
              resolution= 5, # sets the resolution of the scale
              troughcolor="#888888",
              fg="#ffffff",
              bg="#000000",) 
scale.set(50) # sets the initial value of the scale
scale.pack()

cold = PhotoImage(file="cold.png")
coldlabel = Label(image=cold)
coldlabel.pack()

button = Button(window, text="Submit", command=submit)
button.pack()


window.mainloop() # places the window on the screen