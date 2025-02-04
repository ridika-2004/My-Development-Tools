from tkinter import *
from tkinter import ttk
from tkinter.ttk import *
import time

def start():
    gigabyte = 100
    downloaded=0
    speed =1
    while(downloaded<gigabyte):
        time.sleep(0.05)
        bar['value']+=(speed/gigabyte)*100
        downloaded+=speed
        percent.set(str(int((downloaded/gigabyte)*100))+"%")
        text.set(str(downloaded)+"/"+str(gigabyte)+" gigabyte completed")
        window.update_idletasks()

window = Tk() # creates a blank window
window.title("Progress Bar in python") # sets the title of the window
window.geometry("420x320") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window

percent = StringVar()
text = StringVar()

bar = Progressbar(window,orient=HORIZONTAL,length=200)
bar.pack(pady=10)

percentlabel = Label(window,textvariable=percent).pack()
tasklabel = Label(window,textvariable=text).pack()

Button(window, text="Download", command=start).pack()

window.mainloop() # places the window on the screen