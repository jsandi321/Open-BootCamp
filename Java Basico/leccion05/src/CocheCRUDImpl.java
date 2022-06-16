import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Save");
    }

    @Override
    public void findAll() {
        System.out.println("Find All");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }
}
