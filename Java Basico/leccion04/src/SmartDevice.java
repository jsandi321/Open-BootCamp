public class SmartDevice {
    //Atributos de la clase
    protected String marca;
    protected String nombre;
    protected String os;
    protected boolean encendido;
    protected int bateria=100;
    //Constructores de la clase
    public SmartDevice(){

    }
    public SmartDevice(String marca, String nombre, String os, boolean encendido, int bateria){
        //Constructor con atributos
        this.nombre = nombre;
        this.marca = marca;
        this.os = os;
        this.encendido = encendido;
        this.bateria = bateria;
    }
    //Metodos de la clase
    public void encendido(boolean estado){
        this.encendido = estado;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOs() {
        return os;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getBateria() {
        return bateria;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", os='" + os + '\'' +
                ", encendido=" + encendido +
                ", bateria=" + bateria +
                '}';
    }
}
