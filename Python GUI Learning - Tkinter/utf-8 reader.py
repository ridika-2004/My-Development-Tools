from tkinter import Tk, Text, filedialog

# Tkinter setup
window = Tk()
window.title("UTF-8 File Reader")

text_widget = Text(window, wrap="word", font=("Arial", 12))
text_widget.pack(expand=True, fill="both")

def open_file():
    file_path = filedialog.askopenfilename(filetypes=[("Text Files", "*.txt"), ("All Files", "*.*")])
    
    if file_path:
        try:
            with open(file_path, "r", encoding="utf-8") as file:
                content = file.read()
                text_widget.delete("1.0", "end")  # Clear old text
                text_widget.insert("1.0", content)  # Insert new text
        except UnicodeDecodeError:
            text_widget.insert("1.0", "Error: File is not UTF-8 encoded!")

# Call open_file() to load a file
open_file()

window.mainloop()
