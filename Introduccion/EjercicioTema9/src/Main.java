
public class Main {
    public static void main(String[] args) {
        //Parte 1 Objeto Cliente
        Cliente cliente1 = new Cliente();
        System.out.println("Informacion el cliente");
        cliente1.setNombre("Alexis Sandi");
        System.out.println("El nombre del cliente es: "+cliente1.getNombre());
        cliente1.setEdad(51);
        System.out.println("La edad del cliente es: "+cliente1.getEdad());
        cliente1.setTelefono("84172623");
        System.out.println("El teléfono del cliente: "+cliente1.getTelefono());
        cliente1.setCredito(5000);
        System.out.println("El credito del cliente es de: "+cliente1.getCredito());
        System.out.println(" ");


        //Parte 2 Objeto Trabajador
        System.out.println("Informacion de trabajador");
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Jeison Sandi");
        System.out.println("El nombre del trabajador es: "+trabajador1.getNombre());
        trabajador1.setEdad(25);
        System.out.println("La edad del trabajador es: "+trabajador1.getEdad());
        trabajador1.setTelefono("89274365");
        System.out.println("El telefono del trabajador es: "+trabajador1.getTelefono());
        trabajador1.setSalario(400000);
        System.out.println("El salario del trabajador es de: $ "+trabajador1.getSalario());
    }
}
class Persona{
    //Parametros de la clase
    private int edad;
    private String nombre;
    private String telefono;

    //Metodos de la clase
    //Seters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Geters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona{
    //Propiedades de la clase
    private int credito;

    //Metodos de la clase

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    //Propiedades de la clase
    private int Salario;

    //Metodos de la clase


    public void setSalario(int salario) {
        Salario = salario;
    }

    public int getSalario() {
        return Salario;
    }
}