numero = int(input("Ingrese un numero entero: "))

def es_primo(num):
	for n in range (2, num):
		if(num % n == 0):
			print("El numero no es primo")
			return False
	print("El numero es primo")
	return True

es_primo(numero)

