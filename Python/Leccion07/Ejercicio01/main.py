import operaciones

def main():
    resta = operaciones.resta(10, 2)
    suma = operaciones.suma(10,2)
    multi = operaciones.multiplicacion(10, 2)
    division = operaciones.divsion(10,2)
    print("Resultado de la resta "+str(resta))
    print("Resultado de la suma " + str(suma))
    print("Resultado de la multiplicacion " + str(multi))
    print("Resultado de la division " + str(division))

if __name__ == '__main__':
    main()


