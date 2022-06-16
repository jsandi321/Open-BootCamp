public class Main {
    static CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}