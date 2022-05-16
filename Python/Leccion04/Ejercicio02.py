numero_inicial = int(input("Ingresa el numero inicial: "))
numero_final = int(input("Ingresa el numero final, debe ser mayor que el inicial: "))

impares = []

for i in range (numero_inicial, numero_final+1):
	if( i % 2 != 0):
		impares.append(i)


print(impares)

