from tkinter import *

def arial_font():
    print("Arial font selected")

def times_font():
    print("Times New Roman font selected")

def helvetica_font():
    print("Helvetica font selected")

def fira_sans_font():
    print("Fira Sans font selected")

def red_color():
    print("Red color selected")

def blue_color():
    print("Blue color selected")

def green_color():
    print("Green color selected")

window = Tk()
window.title("Nested Menus Example")
window.geometry("500x400")

# Creating Menubar
menubar = Menu(window)

# Adding the 'Font' menu with nested items
fontmenu = Menu(menubar, tearoff=0)
menubar.add_cascade(label="Font", menu=fontmenu)

# 'Suggested Fonts' submenu under the 'Font' menu
suggested_fonts = Menu(fontmenu, tearoff=0)
fontmenu.add_cascade(label="Suggested Fonts", menu=suggested_fonts)
suggested_fonts.add_command(label="Arial", command=arial_font)
suggested_fonts.add_command(label="Times New Roman", command=times_font)
suggested_fonts.add_command(label="Helvetica", command=helvetica_font)
suggested_fonts.add_command(label="Fira Sans", command=fira_sans_font)

# Adding 'Colors' submenu under the 'Font' menu
colors_menu = Menu(fontmenu, tearoff=0)
fontmenu.add_cascade(label="Colors", menu=colors_menu)
colors_menu.add_command(label="Red", command=red_color)
colors_menu.add_command(label="Blue", command=blue_color)
colors_menu.add_command(label="Green", command=green_color)

# Adding the 'File' menu
filemenu = Menu(menubar, tearoff=0)
menubar.add_cascade(label="File", menu=filemenu)
filemenu.add_command(label="Open")
filemenu.add_command(label="Save")
filemenu.add_separator()
filemenu.add_command(label="Exit", command=window.quit)

# Display the menubar
window.config(menu=menubar)

window.mainloop()
