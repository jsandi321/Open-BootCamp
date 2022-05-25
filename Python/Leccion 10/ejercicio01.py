from tkinter import *
from tkinter.ttk import *

def seleccionar():
    monitor.config(text = "Opción {}".format(opcion.get() ) )

def reset():
    opcion.set(None)
    monitor.config(text='') 


window = Tk()
window.geometry('175x175')

opcion = IntVar()
opcion.set(None)

Radiobutton(window, text="Opcion 1", variable=opcion, value= 1, command=seleccionar).pack()
Radiobutton(window, text="Opcion 2", variable=opcion, value= 2, command=seleccionar).pack()
Radiobutton(window, text="Opcion 3", variable=opcion, value= 3, command=seleccionar).pack()

monitor = Label(window)
monitor.pack

Button(window, text='Reiniciar opciones', command=reset).pack()

window.mainloop()
