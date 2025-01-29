from tkinter import *

window = Tk() # creates a blank window
window.title("Tick the checkbox") # sets the title of the window
window.geometry("300x300") # sets the size of the window

def order():
    if x.get()==0:
        print("You ordered a burger")
    elif x.get()==1:
        print("You ordered a donut")
    else:
        print("Ehh?")

burger = PhotoImage(file="burger.png")
donut = PhotoImage(file="donut.png")
foodimages = [burger,donut]

x = IntVar()

food = ["Burger","Donut"]

for i in range(len(food)):
    radiobutton = Radiobutton(window,
                              text = food[i], # sets the text of the radiobutton
                              variable=x, # groups radiobutton together if they share same variable
                              font=("Impact", 20),
                              image=foodimages[i],
                              value=i, # assigns radio buttons a diffrerent value for each
                              padx = 20,
                              compound='left',
                              command=order) # assigns a function to the radi
    radiobutton.pack(anchor=W) # packs the radiobutton to the window

window.mainloop() # places the window on the screen