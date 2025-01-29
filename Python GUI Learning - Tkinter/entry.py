from tkinter import *

# entry widgets = textbox that accepts a single line of user input

def submit():
    username = entry.get()
    print("Hello " + username)

def delete():
    entry.delete(0, END)

def backspace():
    entry.delete((len(entry.get())-1), END)

window = Tk() # creates a blank window
window.title("Enter your name") # sets the title of the window

entry = Entry(window,
              font=("Arial", 24),
              show="*") # creates an entry widget
entry.pack(side="left")

submitbutton = Button(window,
                      text="Submit",
                      command=submit)
submitbutton.pack(side="right")

deletebutton = Button(window,
                      text="Delete",
                      command=delete)
deletebutton.pack(side="right")

backspacebutton = Button(window,
                      text="Backspace",
                      command=backspace)
backspacebutton.pack(side="right")

window.mainloop() # places the window on the screen