import functools

def impares(lista):
    lista_filtrada = list(filter((lambda x: x % 2), lista))
    print(lista_filtrada)
    lista_filtrada = functools.reduce((lambda x,y : x+y), lista_filtrada)
    print(f'La suma de los impares de la lista es: {lista_filtrada}')

lista_prueba = list(range(1, 100))
impares(lista_prueba)