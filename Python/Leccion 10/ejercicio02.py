from tkinter import*
from tkinter.ttk import *

window = Tk()

item = StringVar()

list_box = Listbox(window)

list_box.insert(1, 'Yuli')
list_box.insert(2,'Jeison')
list_box.insert(3,'Gabi')
list_box.insert(4,'Jessie')

list_box.pack()

label = Label(text='Lista CloseFriends').pack()

window.mainloop()   