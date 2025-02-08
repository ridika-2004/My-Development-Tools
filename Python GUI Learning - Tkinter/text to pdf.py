from tkinter import *
from tkinter import filedialog
from fpdf import FPDF 

def savefileaspdf():
    words = text.get("1.0", "end-1c")  # Remove the last newline character
    if not words.strip():
        return  # Prevent saving an empty PDF
    
    pdf = FPDF()
    pdf.add_page()
    pdf.set_font("Arial", size=12)  # Set font before adding text
    pdf.multi_cell(0, 10, txt=words)
    
    filepath = filedialog.asksaveasfilename(defaultextension=".pdf", filetypes=[("PDF Files", "*.pdf")])
    if filepath:  # If user selects a file
        pdf.output(filepath)

window = Tk() # creates a blank window
window.title("Text To Pdf") # sets the title of the window
window.geometry("500x400") # sets the size of the window
icon = PhotoImage(file="cool.png") # creates a photo image object
window.iconphoto(True, icon) # sets the icon of the window
window.config(bg="#ffffdd") # sets the background color of the window

# Create a headline label
headline_label = Label(window, text="Save a file in pdf!!", font=("Arial", 24), bg="#ffffdd", fg="#000000")
headline_label.pack(pady=10)

text = Text(window,height=15,width=60, font=("Arial", 8))
text.pack()

button = Button(text="Save",command=savefileaspdf)
button.pack(pady=5)

window.mainloop() # places the window on the screen