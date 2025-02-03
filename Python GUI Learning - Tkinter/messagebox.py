from tkinter import *
from tkinter import messagebox

def click():
    messagebox.showinfo(title="Did you know?",
                        message="Average clouds weigh more than a million pound!!!")

    # messagebox.showwarning(title="It's a warning!",
    #                      message="Earth is around 4.5 billion years old. So are you!!!")

    # messagebox.showerror(title="It's an error!",
    #                      message="Human errors are unavoidable and inevitable!!!")

    # if messagebox.askokcancel(title="ask ok/cancel!", message="Do you agree?"):
    #     print("You agreed")
    # else:
    #     print("You canceled it")

    # if messagebox.askretrycancel(title="ask retry/cancel!", message="Do you want to retry?"):
    #     print("Yess!!")
    # else:
    #     print("Oh no :(. why??")

    # if messagebox.askyesno(title="yes/no", message="Do you like spice?"):
    #     print("yessss!!")
    # else:
    #     print("not cool")

    # ans = messagebox.askquestion(title="ask ques", message="Do you know I'm cool?")
    # if ans=='yes':
    #     print("Thanks")
    # else:
    #     print("You don't know me")

    # ans = messagebox.askyesnocancel(title="yes/no/cancel",message="wanna collab with me?")
    # if ans==True:
    #     print("Thanks")
    # elif ans==False:
    #     print("Why? :(")
    # else:
    #     print("You sneaky one!")


window = Tk() # creates a blank window
window.title("MessageBox in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window
window.config(bg="#ffffdd") # sets the background color of the window

# Create a headline label
headline_label = Label(window, text="Click this to see!", font=("Arial", 16), bg="#ffffdd", fg="#000000")
headline_label.pack(pady=10)

button = Button(window,command=click,text="click")
button.pack()

window.mainloop() # places the window on the screen