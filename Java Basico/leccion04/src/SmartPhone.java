
public class SmartPhone extends SmartDevice {
    int almacenamiento;
    //Constructor de la sub clase SmartPhone que hereda de SmartDevice
    public SmartPhone(String marca, String nombre, String os, boolean encendido, int bateria, int almacenamiento) {
        super(marca, nombre, os, encendido, bateria);
        this.almacenamiento = almacenamiento;
        this.nombre = "Smart Phone";
    }
}

