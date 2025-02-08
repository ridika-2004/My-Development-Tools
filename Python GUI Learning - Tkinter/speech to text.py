from tkinter import *
import speech_recognition as sr

def speak():
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        splash_window = Tk()
        splash_window.title("Speaking window")
        splash_window.geometry("900x200")
        # Initial label update
        label = Label(splash_window)
        label.pack(pady=20)         
        label.config(text="Adjusting for ambient noise... Please wait.")
        window.update_idletasks()  # Force update the UI immediately
        recognizer.adjust_for_ambient_noise(source)
        
        label.config(text="Say something...")
        window.update_idletasks()
        
        try:
            audio = recognizer.listen(source, timeout=5)
            
            label.config(text="Recognizing...")
            window.update_idletasks()
            
            # Recognizing speech using Google API
            words = recognizer.recognize_google(audio)
            # label.config(text=words)
            window.update_idletasks()
            text.insert(END, words+" ")
            # label.config(text="")
            splash_window.destroy()
        except sr.UnknownValueError:
            label.config(text="Google API could not understand the audio.")
            window.update_idletasks()
            # label.config(text="")
            splash_window.after(2000,splash_window.destroy)
        except sr.RequestError as e:
            label.config(text=f"Could not request results from Google API; {e}")
            window.update_idletasks()
            # label.config(text="")
            splash_window.after(2000,splash_window.destroy)


# GUI Setup
window = Tk()
window.title("Speech to Text in Python")
window.geometry("500x500")

# App Icon (Ensure the file exists)
icon = PhotoImage(file="cool.png")  # Make sure you have this image file or comment out this line
window.iconphoto(True, icon)

text = Text(window, height=10, width=50)
text.pack(pady=10)

button_frame = Frame(window)
button_frame.pack()

speak_button = Button(button_frame, text="Speak", command=speak)
speak_button.pack(pady=5)

window.mainloop()



