class Alumno:
	#Constructor inicializa las propiedades
	def __init__(self, nombre, nota):
		self.nombre = nombre
		self.nota = nota

	def imprimir_informacion(self):
		print("Nombre: ", self.nombre)
		print("Nota: ", self.nota)

	def resultado_nota(self):
		if(self.nota < 5):
			print("Suspendido")
		else:
			print("Felicidades has aprobado")

alumno1 = Alumno('Jeison', 8)
alumno1.imprimir_informacion()
alumno1.resultado_nota()

