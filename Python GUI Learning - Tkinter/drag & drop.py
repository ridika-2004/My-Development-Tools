from tkinter import *

def drag_start(event):
    widget = event.widget
    widget.startX = event.x
    widget.startY = event.y

def drag_motion(event):
    widget = event.widget
    x = widget.winfo_x()-widget.startX+event.x
    y = widget.winfo_y()-widget.startY+event.y
    widget.place(x=x,y=y)

window = Tk() # creates a blank window
window.title("Drag & drop") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

headline_label = Label(window, text="Arrange my name", font=("Arial Bold", 24), fg="#000000")
headline_label.pack()

label1 = Label(window, text="R", font=("Arial", 20), width=5, height=2, border=2, relief="solid", bd=2)
label1.place(x=300,y=50)

label2 = Label(window, text="I", font=("Arial", 20), width=5, height=2, border=2, relief="solid", bd=2)
label2.place(x=100,y=100)

label3 = Label(window, text="D", font=("Arial", 20), width=5, height=2, border=2, relief="solid", bd=2)
label3.place(x=200,y=50)

label4 = Label(window, text="K", font=("Arial", 20), width=5, height=2, border=2, relief="solid", bd=2)
label4.place(x=50,y=50)

label5 = Label(window, text="A", font=("Arial", 20), width=5, height=2, border=2, relief="solid", bd=2)
label5.place(x=150,y=150)

label6 = Label(window, text="I", font=("Arial", 20), width=5, height=2, border=2, relief="solid", bd=2)
label6.place(x=250,y=100)

label1.bind("<Button-1>",drag_start)
label1.bind("<B1-Motion>",drag_motion)

label2.bind("<Button-1>",drag_start)
label2.bind("<B1-Motion>",drag_motion)

label3.bind("<Button-1>",drag_start)
label3.bind("<B1-Motion>",drag_motion)

label4.bind("<Button-1>",drag_start)
label4.bind("<B1-Motion>",drag_motion)

label5.bind("<Button-1>",drag_start)
label5.bind("<B1-Motion>",drag_motion)

label6.bind("<Button-1>",drag_start)
label6.bind("<B1-Motion>",drag_motion)

window.mainloop() # places the window on the screen