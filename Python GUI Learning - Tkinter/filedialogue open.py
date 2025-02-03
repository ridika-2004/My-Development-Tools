from tkinter import *
from tkinter import filedialog

def openfile():
    filepath = filedialog.askopenfilename()
    file = open(filepath,'r',encoding="utf-8")
    print(file.read())
    file.close()

window = Tk() # creates a blank window
window.title("File dialogue opening in python") # sets the title of the window
window.geometry("700x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window
window.config(bg="#ffffdd") # sets the background color of the window

# Create a headline label
headline_label = Label(window, text="Open a file to know some weird facts!!", font=("Arial", 24), bg="#ffffdd", fg="#000000")
headline_label.pack(pady=10)

button = Button(text="Open",command=openfile)
button.pack()



window.mainloop() # places the window on the screen