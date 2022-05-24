
import os
from pickle import *

class Vehiculo:

    def __init__(self, modelo, color):
        self.modelo = modelo
        self.color = color

    def getModelo(self):
        return self.modelo

    def getColor(self):
        return self.color


coche1 = Vehiculo('Corolla', "rojo")

f = open('datos.txt', 'w+b')

dump(coche1, f)

f.seek(0)

coche2 = load(f)

print(f'El coche es un {coche2.getModelo()}  {coche2.getColor()}')

