from tkinter import *

# grid = manages widgets in a table-like structure


window = Tk() # creates a blank window
window.title("Grid geometry manager in python") # sets the title of the window
# window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

# Create a headline label
headline_label = Label(window, text="This are Grids!", font=("Arial", 24), fg="#000000").grid(row=0,column=0,pady=10,columnspan=2)

firstnamelabel = Label(window,text="First name : ",width=20).grid(row=1,column=0)
firstnameentry = Entry(window).grid(row=1,column=1,pady=5)

lastnamelabel = Label(window,text="Last name : ",width=20).grid(row=2,column=0)
lastnameentry = Entry(window).grid(row=2,column=1,pady=5)

emaillabel = Label(window,text="Email : ",width=20).grid(row=3,column=0)
emailentry = Entry(window).grid(row=3,column=1,pady=5)

submitbutton = Button(window,text="Submit").grid(row=4,column=0,columnspan=2)

window.mainloop() # places the window on the screen