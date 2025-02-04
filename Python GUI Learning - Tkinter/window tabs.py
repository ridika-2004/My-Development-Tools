from tkinter import *
from tkinter import ttk

window = Tk() # creates a blank window
window.title("My First GUI Program in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

notebook = ttk.Notebook(window) # a widget that's a collection of windows

tab1 = Frame(notebook) # new frame for tab1
tab2 = Frame(notebook)

notebook.add(tab1,text="Tab 1")
notebook.add(tab2,text="Tab 2")
notebook.pack(expand=True,
              fill="both") # fills both x and y axis

Label(tab1,text="This is Tab 1",height=25,width=50).pack()
Label(tab2,text="This is Tab 2",height=25,width=50).pack()

window.mainloop() # places the window on the screen