class Vehiculo:
	color = ''
	ruedas = 0
	puertas = 0


class Coche(Vehiculo):
	velocidad = 0
	cilindrada = 0

coche1 = Coche()
coche1.color = "rojo"
coche1.ruedas = 4
coche1.puertas = 4
coche1.velocidad = 50
coche1.cilindrada = 1500

print("El coche es color "+coche1.color+" y tiene "+str(coche1.ruedas)+" ruedas, "+str(coche1.puertas)+" puertas")
print("El coche tiene una cilindrada de "+str(coche1.cilindrada)+"cc y viaja a una velociad de "+str(coche1.velocidad)+"km/h")

