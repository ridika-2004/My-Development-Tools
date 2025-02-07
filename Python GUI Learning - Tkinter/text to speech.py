from tkinter import *
import pyttsx3

def speak():
    engine = pyttsx3.init()
    # engine.setProperty('rate',125)
    voices = engine.getProperty('voices')
    engine.setProperty('voice', voices[1].id)
    engine.say(my_entry.get())
    engine.runAndWait()
    my_entry.delete(0,END)

window = Tk() # creates a blank window
window.title("Text To Speech in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window
window.config(bg="#191c27")


my_entry = Entry(window,font=("Arial",20)).pack(pady=10)

my_button = Button(window,font=("Arial",20),command=speak,text="Speak").pack(pady=10)

window.mainloop() # places the window on the screen