import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverse("Hola Mundo"));
        ejercicioArray();
        ejercicioArrayBi();
        ejercicioVector();
    }

    public static String reverse(String texto) {
        /*
        Escribe el código que devuelva una cadena al revés.
        Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
         */
        StringBuilder stringInvertido = new StringBuilder();
        //String  = "";
        for(int i = (texto.length() - 1); i >= 0; i--){
            stringInvertido.append(texto.charAt(i));
        }
        return String.valueOf(stringInvertido);
    }
    public static void ejercicioArray(){
        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String []arrayUnidimencional = new String[5];
        arrayUnidimencional[0] = "Jeison";
        arrayUnidimencional[1] = "Yuli";
        arrayUnidimencional[2] = "Gabi";
        arrayUnidimencional[3] = "Alex";
        arrayUnidimencional[4] = "Luna";
        for (String s : arrayUnidimencional) {
            System.out.println(s);
        }
    }
    public static void ejercicioArrayBi(){
        /*
        Crea un array bidimensional de enteros y recórrelo,
        mostrando la posición y el valor de cada elemento en ambas dimensiones.
         */
        int [][]arrayBidimensional = new int[2][2];
        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;

        arrayBidimensional[1][0] = 10;
        arrayBidimensional[1][1] = 20;

        for(int i = 0; i < arrayBidimensional.length; i++){
            //Primera dimension
            for(int j = 0; j < arrayBidimensional[i].length; j++){
                //Segunda dimension
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidimensional[i][j]);
            }
        }
    }
    public static void ejercicioVector(){
        /*
        Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final.
         */
        Vector<String> vector = new Vector();
        vector.add("Pizza");
        vector.add("Hamburguesa");
        vector.add("Papas fritas");
        vector.add("Tacos");
        vector.add("Burrito");
        System.out.println("Comidas: "+vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println("Comidas: "+vector);
        /*
        Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
        si tuviésemos 1000 elementos para ser añadidos al mismo.
        R/ El vector crecera automaticamente generando una operación de copia de arrays en la cual
        copia de un array al nuevo para ampliar la nueva capacidad y esto es computacionalmente costoso y en memoria
        para el caso de vectores muy grandes.
         */
    }
}