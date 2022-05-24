import os

archivo = open('archivo_texto.txt', 'w')
archivo.write('Primera linea de texto\n')
archivo.close()

archivo = open('archivo_texto.txt', 'r+')
archivo.readline()
archivo.write('Segunda linea de texto\n')
archivo.close()

