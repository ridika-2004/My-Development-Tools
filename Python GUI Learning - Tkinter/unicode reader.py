from tkinter import Tk, Text, filedialog
import codecs

# Tkinter setup
window = Tk()
window.title("Unicode File Reader")

text_widget = Text(window, wrap="word", font=("Arial Unicode MS", 12))


text_widget.pack(expand=True, fill="both")

def open_unicode_file():
    file_path = filedialog.askopenfilename(filetypes=[("Text Files", "*.txt"), ("All Files", "*.*")])
    
    if file_path:
        try:
            # Try reading as UTF-8 first
            with codecs.open(file_path, "r", encoding="utf-8") as file:
                content = file.read()
        except UnicodeDecodeError:
            try:
                # If UTF-8 fails, try reading as UTF-16
                with codecs.open(file_path, "r", encoding="utf-16") as file:
                    content = file.read()
            except UnicodeDecodeError:
                try:
                    # If UTF-16 fails, try reading as UTF-32
                    with codecs.open(file_path, "r", encoding="utf-32") as file:
                        content = file.read()
                except UnicodeDecodeError:
                    content = "Error: File encoding not supported!"
        
        # Display content
        text_widget.delete("1.0", "end")
        text_widget.insert("1.0", content)

# Open a file when the program runs
open_unicode_file()

window.mainloop()
