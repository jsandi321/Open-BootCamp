from pyexpat import model
from django.db import models

# Create your models here

class Director(models.Model):
    name = models.CharField(max_length=64,help_text="Pon el nombre del director")
    
    def __str__(self):
        return self.name

class Pelicula(models.Model):
    tittle = models.CharField(max_length=64, help_text="Descripcion de la pelicula")
    description = models.TextField(max_length=100)
    director = models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)

    def __str__(self):
        return self.tittle
    


