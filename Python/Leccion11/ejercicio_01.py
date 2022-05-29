import sqlite3

con = sqlite3.connect('baseAlumnos.db')
cur = con.cursor()

cur.execute("CREATE TABLE Alumnos(id INT, nombre TEXT, apellido TEXT)")

cur.execute("INSERT INTO Alumnos VALUES(1, 'Yuli','Fernandez')")
cur.execute("INSERT INTO Alumnos VALUES(2, 'Gabi','Sandi')")
cur.execute("INSERT INTO Alumnos VALUES(3, 'Alex','Sandi')")
cur.execute("INSERT INTO Alumnos VALUES(4, 'Flor','Mena')")
cur.execute("INSERT INTO Alumnos VALUES(5, 'Luis','Hernandez')")
cur.execute("INSERT INTO Alumnos VALUES(6, 'Alberto','Gomez')")
cur.execute("INSERT INTO Alumnos VALUES(7, 'Irene','Sandobal')")
cur.execute("INSERT INTO Alumnos VALUES(1, 'Jorge','Mendoza')")

con.commit()

cur.execute("SELECT * FROM Alumnos WHERE nombre = 'Luis'")
alumno = cur.fetchall()

print(alumno)

con.close()