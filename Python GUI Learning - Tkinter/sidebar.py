from tkinter import *

menu_visible = False 

def hide_menu():
    global menu_visible
    sidebar.place_forget()
    menu_visible = False

def show_menu():
    global menu_visible
    sidebar.place(x=0, y=40)
    menu_visible = True

def toggle_menu():
    if menu_visible:
        hide_menu()
    else:
        show_menu()

def red():
    # print("Red button clicked!")
    window.config(bg="red")

def blue():
    # print("Blue button clicked!")
    window.config(bg="blue")

def green():
    # print("Green button clicked!")
    window.config(bg="green")

def yellow():
    # print("Yellow button clicked!")
    window.config(bg="yellow")

window = Tk()
window.title("My First GUI Program in Python")
window.geometry("420x320")
icon = PhotoImage(file="cool.png")
window.iconphoto(True, icon)

# Sidebar menu
sidebar = Frame(window, bg="black", width=80, height=300)
sidebar.pack_propagate(False)

# Sidebar Buttons
button1 = Button(sidebar, text="Red", bg="white", fg="black", command=red, width=5, height=1)
button1.pack(pady=5)
button2 = Button(sidebar, text="Blue", bg="white", fg="black", command=blue, width=5, height=1)
button2.pack(pady=5)
button3 = Button(sidebar, text="Green", bg="white", fg="black", command=green, width=5, height=1)
button3.pack(pady=5)
button4 = Button(sidebar, text="Yellow", bg="white", fg="black", command=yellow, width=5, height=1)
button4.pack(pady=5)

# Sidebar initially hidden
sidebar.place_forget()

# Menu button to toggle sidebar
menubutton = Button(window, text="☰", width=5, height=1, bg="black", fg="white", command=toggle_menu)
menubutton.place(x=5, y=5)

# Headline label
headline_label = Label(window, text="Click on the sidebar!", font=("Arial", 16), fg="black")
headline_label.pack(pady=10)

window.mainloop()
