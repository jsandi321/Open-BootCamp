public class Main
{
    public static void main(String[] args) {
        /*
        Parte 1
        Crear una funcion con tres parametros que sean numeros que se
        suman entre si y llamarla desde el main
         */
        int numero1 = 9;
        int numero2 = 20;
        int numero3 = 10;

        int resultadoSuma = Sumar(numero1, numero2, numero3);
        System.out.println(resultadoSuma);

        /*
            Parte 2
            Crear una clase coche.
            Dentro de la clase coche, una variable numérica que almacene
            el número de puertas que tiene.
            Una función que incremente el número de puertas que tiene
            el coche.
            Crear un objeto miCoche en el main y añadirle una puerta.
            Mostrar el número de puertas que tiene el objeto.
         */
        Coche miCoche = new Coche();
        int puertas = 2;
        miCoche.AgregarPuertas(puertas);
        System.out.println(miCoche.puertas);


    }
    public static int Sumar(int numA, int numB, int numC)
    {
        int resultado;
        resultado = numA + numB + numC;
        return resultado;
    }
}

class Coche
{
    //Atributos de la clase
    public int puertas = 0;

    public void AgregarPuertas(int puertasPa)
    {
        this.puertas += puertasPa;
    }
}