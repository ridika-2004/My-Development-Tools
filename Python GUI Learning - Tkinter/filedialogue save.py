from tkinter import *
from tkinter import filedialog

def savefile():
    file = filedialog.asksaveasfile(defaultextension=".txt",
                                    filetypes=[("text file",".txt"),("HTML file",".html"),("All files",".*")])
    filetext = str(text.get(1.0,END))
    file.write(filetext)
    file.close()

window = Tk() # creates a blank window
window.title("File dialogue saving in python") # sets the title of the window
window.geometry("500x400") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window
window.config(bg="#ffffdd") # sets the background color of the window

# Create a headline label
headline_label = Label(window, text="Save a file!!", font=("Arial", 24), bg="#ffffdd", fg="#000000")
headline_label.pack(pady=10)

text = Text(window,height=15,width=60,font=("Ink Free",12))
text.pack()

button = Button(text="Save",command=savefile)
button.pack(pady=5)

window.mainloop() # places the window on the screen