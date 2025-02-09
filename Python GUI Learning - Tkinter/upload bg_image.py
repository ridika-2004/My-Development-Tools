from tkinter import *
from tkinter import filedialog
from PIL import Image, ImageTk

def uploadpic():
    filepath = filedialog.askopenfilename(filetypes=[("Image Files", "*.png;*.jpg;*.jpeg;*")])
    if filepath:
        display(filepath)

def display(filepath):
    # Get window dimensions
    window_width = window.winfo_width()
    window_height = window.winfo_height()

    img = Image.open(filepath)
    img = img.resize((window_width, window_height), Image.LANCZOS)  # Resize to fit window

    img_tk = ImageTk.PhotoImage(img)  # Convert to Tkinter format
    
    # Set image on Label instead of window.config
    bg_label.config(image=img_tk)
    bg_label.image = img_tk  # Keep reference to avoid garbage collection

window = Tk()
window.title("Upload a Pic in Python")

# Get screen size
screen_width = window.winfo_screenwidth()
screen_height = window.winfo_screenheight()

window.geometry(f"{screen_width}x{screen_height}")

icon = PhotoImage(file="cool.png")
window.iconphoto(True, icon)

# Background Label to hold image
bg_label = Label(window)
bg_label.place(x=0, y=0, relwidth=1, relheight=1)  # Stretch to fit window

# Upload Button (Place on top to keep it visible)
upload = Button(window, text="Upload", font=("Arial", 14), bg="#5dbea3", fg="white", command=uploadpic)
upload.place(x=500, y=20)  # Placed at the top-left

window.mainloop()
