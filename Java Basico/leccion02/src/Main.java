import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Para este ejercicio tendréis que crear una función que reciba
        un precio y devuelva el precio con el IVA incluido.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();
        double precioIVA = calcularIVA(precio);
        System.out.println("El precio con IVA es: "+precioIVA);

    }

    static double calcularIVA(double precio){
        double totalIVA = precio * 0.13;
        return precio+totalIVA;
    }

}