from tkinter import *
from time import strftime
from PIL import Image, ImageTk

def update():
    time_string = strftime("%I:%M:%S %p")
    time_label.config(text=time_string)

    day_string = strftime("%A")
    day_label.config(text=day_string)

    date_string = strftime("%B %d, %Y")
    date_label.config(text=date_string)

    window.after(1000, update)

window = Tk()
window.title("Digital Clock & Date")

width = window.winfo_screenwidth()
height = window.winfo_screenheight()

# Canvas for background
canvas = Canvas(window, width=width, height=height, highlightthickness=0)
canvas.pack(fill="both", expand=True)

# Load and display background image
bg_photo = Image.open("background.png")
bg_photo = bg_photo.resize((width, height))
bg_photo = ImageTk.PhotoImage(bg_photo)
canvas.create_image(0, 0, image=bg_photo, anchor=NW)

# Clock & Date Labels with better styling
time_label = Label(window, font=("Helvetica", 48, "bold"), fg="#d68263", bg="#fbdbbd")
day_label = Label(window, font=("Helvetica", 25, "bold"), fg="#d68263", bg="#fbdbbd")
date_label = Label(window, font=("Helvetica", 25, "bold"), fg="#d68263", bg="#fbdbbd")

headline_label = Label(window,
                       text="Time Flows,Dreams Grow – Keep Moving Forward!⏳✨",
                       font=("Courier", 9, "bold"), fg="#d68263", bg="#fbdbbd")

bottomline_label = Label(window,
                       text="Dream Big, Keep Exploring! 🚀",
                       font=("Courier", 10, "bold"), fg="#d68263", bg="#fbdbbd")

# Adjust positioning
canvas.create_window(width / 2, height / 2 - 200, window=headline_label)
canvas.create_window(width / 2, height / 2 - 100, window=time_label)
canvas.create_window(width / 2, height / 2 - 20, window=day_label)
canvas.create_window(width / 2, height / 2 + 20, window=date_label)
canvas.create_window(width / 2, height / 2 + 70, window=bottomline_label)

update()
window.mainloop()
