package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    String saludo;
    public NotificationService(){
        this.saludo = "Hola buenas, saludo generico";
    }

    public String getSaludo() {
        return saludo;
    }
}
