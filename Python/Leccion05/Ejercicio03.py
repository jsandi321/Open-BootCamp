input_year = int(input("Ingresa el año: "))
print("Calculando ...")

def es_bisiesto(year):
	if (year % 4 == 0) and (year % 100 != 0 or year % 400 == 0):
		print("El año es bisiesto")
	else:
		print("El año no es bisiesto")

es_bisiesto(input_year)
