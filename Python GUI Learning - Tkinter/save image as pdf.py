import tkinter as tk
from tkinter import filedialog, messagebox
from PIL import Image, ImageTk
import shutil
import os
from fpdf import FPDF

# Global variable to store the image path
image_path = None

def upload_image():
    global image_path
    file_path = filedialog.askopenfilename(filetypes=[("Image Files", "*.png;*.jpg;*.jpeg;*")])
    if file_path:
        image = Image.open(file_path)
        image.thumbnail((300, 300))  # Resize image if necessary
        photo = ImageTk.PhotoImage(image)
        display_image_in_text_widget(photo)
        image_path = file_path  # Store the image path
        save_image(file_path)
        messagebox.showinfo("Success", "Image uploaded successfully!")

def display_image_in_text_widget(photo):
    # Insert the image into the Text widget
    text.image_create("end", image=photo)  # Insert image at the end
    text.image = photo  # Keep a reference to avoid garbage collection

def save_image(file_path):
    global image_path
    save_dir = "saved_images"
    
    if not os.path.exists(save_dir):
        os.makedirs(save_dir)
    
    filename = os.path.basename(file_path)
    image_path = os.path.join(save_dir, filename)

    # Open the image and save it as non-interlaced PNG
    image = Image.open(file_path)
    image = image.convert("RGB")  # Convert to non-interlaced format
    image.save(image_path, format="PNG", interlace=False)

    print("Image saved to:", image_path)


def save_as_pdf():
    global image_path
    text_content = text.get("1.0", "end-1c")  # Extract text from the Text widget

    file_path = filedialog.asksaveasfilename(defaultextension=".pdf",
                                             filetypes=[("PDF Files", "*.pdf")])
    if not file_path:
        return  # If user cancels, do nothing

    pdf = FPDF()
    pdf.add_page()
    pdf.set_font("Arial", size=12)

    # Add text content
    for line in text_content.split("\n"):
        pdf.cell(0, 10, line, ln=True)

    # Add image if uploaded
    if image_path:
        pdf.ln(10)  # Add space before image
        pdf.image(image_path, x=10, w=100)  # Resize image width to 100 pixels

    pdf.output(file_path)
    messagebox.showinfo("Success", "File saved as PDF!")

# Create the main window
root = tk.Tk()
root.title("Image and Text to PDF")

# Set window size
root.geometry("500x500")

# Create and pack widgets
upload_button = tk.Button(root, text="Upload Image", command=upload_image)
upload_button.pack(pady=5)

text = tk.Text(root, height=10, width=50)
text.pack(pady=5)

save_button = tk.Button(root, text="Save as PDF", command=save_as_pdf)
save_button.pack(pady=5)

# Run the application
root.mainloop()
