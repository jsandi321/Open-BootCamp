public class Main {
    public static void main(String[] args) {

        SmartPhone galaxyS = new SmartPhone("Samsung", "Telefono", "Android", true, 72, 256);
        SmartWatch appleWatch = new SmartWatch("Apple","SmartWatch", "IOs",true, 80, 4);
        String infoPhone = galaxyS.toString();
        String infoWatch = appleWatch.toString();
        System.out.println("Informacion Galaxy S22: ");
        System.out.println(infoPhone);
        System.out.println("Informacion Apple Watch: ");
        System.out.println(infoWatch);

    }
}