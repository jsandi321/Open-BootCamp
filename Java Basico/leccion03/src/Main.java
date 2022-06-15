public class Main {
    public static void main(String[] args) {
        /*
        En este ejercicio tenéis que crear un bucle que permita concatenar
        textos e imprima el resultado final por consola.
        Tened en cuenta que los textos pueden venir de un array de tipo String.
         */
        String[] nombres = {"Hola", "estoy", "concatenando", "textos",};
        System.out.println(concatenarString(nombres));
    }
    public static String concatenarString(String[] nombres) {
        StringBuilder concatenado = new StringBuilder();
        for (int i = 0; i < nombres.length; i++) {
            concatenado.append(" ").append(nombres[i]);
        }
        return concatenado.toString();
    }
}