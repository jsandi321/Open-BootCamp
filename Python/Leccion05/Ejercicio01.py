import math 

altura = int(input("Ingrese la altura del triangulo "))
base = int(input("Ingrese la base del triangulo: "))


def areaTriangulo(alturaPa, basePa):
	resultado = (basePa * alturaPa) / 2
	return resultado

resultadoTriangulo = areaTriangulo(altura, base)
print("El area del rectangulo es: "+str(resultadoTriangulo))

radioCirculo = int(input("Ingrese el valor del area del circulo: "))

def areaCirculo(radio):
	pi = math.pi
	resultado = pi * (radio*radio)
	return resultado

resultadoCirculo = areaCirculo(radioCirculo)
print("El area del circulo es: "+str(resultadoCirculo))

