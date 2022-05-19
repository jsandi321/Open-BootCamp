from time import strftime

hora = strftime('%H')
minutos = strftime('%M')

def esHora():
    if(int(hora)) >= 19:
        print("Es hora de ir a casa!!!")

    else:
        print("Faltan {} horas y {} minutos para ir a casa..." .format(18- int(hora), 59-int(minutos)))

esHora()