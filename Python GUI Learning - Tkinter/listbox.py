from tkinter import *

# listbox = a listing of selectable text items within it's own container

def submit():
    movie = []
    for x in listbox.curselection():
        movie.insert(x,listbox.get(x))

    print("You've selected: ")
    for x in movie:
        print(x)

def add():
    listbox.insert(listbox.size(),entry.get())
    print(f"You added {entry.get()}")
    listbox.config(height=listbox.size())

def delete():
    for x in listbox.curselection():
        print(f"You deleted {listbox.get(x)}")

    for x in listbox.curselection():
        listbox.delete(x)
    listbox.delete(listbox.curselection())
    listbox.config(height=listbox.size())

window = Tk()
window.title("Listbox in python")
window.geometry("500x500")
window.config(bg="#f7ffde")

headline = Label(window,text="Choose Your Ghibli Movie",font=("Arial Bold",20),bg="#f7ffde",fg="#0000ff")
headline.pack(pady=10)

listbox = Listbox(window,
                  bg="#f7ffde",
                  font=("constantia", 15),
                  width=50,
                  selectmode=MULTIPLE)
listbox.pack()

listbox.insert(1,"My Neighbour Totoro")
listbox.insert(2,"Grave Of The Fireflies")
listbox.insert(3,"Howl's Moving Castle")
listbox.insert(4,"Ocean Waves")
listbox.insert(5,"Only Yesterday")
listbox.insert(6,"The Wind Rises")
listbox.insert(7,"Porco Rosso")
listbox.insert(8,"Ponyo")
listbox.insert(9,"Whisper Of The Heart")
listbox.insert(10,"Kiki's Delivery Service")
listbox.insert(11,"The Cat Returns")

listbox.config(height=listbox.size())

entry = Entry(window)
entry.pack(pady=5)

addbutton = Button(window,text="Add",command=add)
addbutton.pack(pady=5)

submitbutton = Button(window,text="Submit",command=submit)
submitbutton.pack(pady=5)

deletebutton = Button(window,text="Delete",command=delete)
deletebutton.pack(pady=5)

icon = PhotoImage(file="cool.png")

window.mainloop()