package com.example.ejercicio01;

import com.example.ejercicio01.entities.Laptop;
import com.example.ejercicio01.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio01Application {

	public static void main(String[] args) {

		//SpringApplication.run(Ejercicio01Application.class, args);
		ApplicationContext context = SpringApplication.run(Ejercicio01Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop01 = new Laptop(null, "HP", "Windows10", "i5",550.99);
		Laptop laptop02 = new Laptop(null, "DELL", "Ubuntu", "i3",450.50);
		Laptop laptop03 = new Laptop(null, "Apple", "MacOs", "A15",999.99);

		repository.save(laptop01);
		repository.save(laptop02);
		repository.save(laptop03);
	}

}
