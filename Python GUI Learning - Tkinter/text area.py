from tkinter import *

def submit():
    input = text.get("1.0",END)
    print(input)

window = Tk() # creates a blank window
window.title("My First GUI Program in python") # sets the title of the window
window.geometry("420x400") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window
window.config(bg="#ddeeff")

# Create a headline label
headline_label = Label(window, text="Write Something!", font=("Arial", 24), fg="#000000")
headline_label.pack(pady=10)

text = Text(window,height=10,width=50,font=("Ink Free",15))
text.pack()

submitbutton = Button(window,text="Submit",command=submit)
submitbutton.pack(pady=5)

window.mainloop() # places the window on the screen