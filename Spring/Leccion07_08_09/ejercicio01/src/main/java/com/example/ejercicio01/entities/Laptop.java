package com.example.ejercicio01.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //Atributos de la clase
    private Long id;
    private String brand;
    private String OS;
    private String processor;
    private double price;

    //Constructores de la clase
    public Laptop(){
    }

    public Laptop(Long id, String brand, String OS, String processor, double price) {
        this.id = id;
        this.brand = brand;
        this.OS = OS;
        this.processor = processor;
        this.price = price;
    }
    //Metodos
    //Setter

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Getters
    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getOS() {
        return OS;
    }

    public String getProcessor() {
        return processor;
    }

    public double getPrice() {
        return price;
    }
}
