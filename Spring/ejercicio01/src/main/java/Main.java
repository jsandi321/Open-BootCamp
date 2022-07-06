import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo01 = (Saludo) context.getBean("SaludoService");
        saludo01.imprimirSaludo();
    }
}
