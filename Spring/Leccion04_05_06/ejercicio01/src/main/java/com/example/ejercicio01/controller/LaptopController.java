package com.example.ejercicio01.controller;


import com.example.ejercicio01.entities.Laptop;
import com.example.ejercicio01.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    //Atributos
    private LaptopRepository laptopRepository;

    //Constructor
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    //Metodo que retorna una lista de Objetos Laptops almacenados en base de datos
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        //Recuperar y devolver todas las laptos en base de datos
        return laptopRepository.findAll();
    }

    //Metodo Request
    @PostMapping("/api/laptops")
    public Laptop  createBook(@RequestBody Laptop laptop){
        //Guarda en base de datos un objeto laptop desde un JSON
        return laptopRepository.save(laptop);
    }
}
