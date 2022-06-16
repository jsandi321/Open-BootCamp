
public class SmartWatch extends SmartDevice{
    int sensores;

    public SmartWatch(String marca, String nombre, String os, boolean encendido, int bateria, int sensores) {
        super(marca, nombre, os, encendido, bateria);
        this.sensores = sensores;
        this.nombre = "Smart Watch";
    }
}
