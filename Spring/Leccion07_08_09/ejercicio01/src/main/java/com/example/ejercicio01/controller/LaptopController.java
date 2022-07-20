package com.example.ejercicio01.controller;


import com.example.ejercicio01.entities.Laptop;
import com.example.ejercicio01.repository.LaptopRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    //Atributos
    private LaptopRepository laptopRepository;
    private Logger log = LoggerFactory.getLogger(LaptopController.class);

    //Constructor
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    /**
     * Metodo que retorna una lista de Objetos Laptops almacenados en base de datos
     * @return
     */
    @ApiOperation("Obtener todos los objetos tipo Laptop en base de datos")
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        //Recuperar y devolver todas las laptos en base de datos
        return laptopRepository.findAll();
    }

    /**
     * Metodo para buscar un objeto tipo Laptop ya existente en la base de datos con su llave primaria
     * @param id
     * @return
     */
    @ApiOperation("Buscar una Laptop existente por su llave primaria")
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@ApiParam("Llave primaria tipo Long")@PathVariable Long id){
        Optional<Laptop> laptopOptional = laptopRepository.findById(id);
        if(laptopOptional.isPresent()){
            return ResponseEntity.ok(laptopOptional.get());
        }
        else return ResponseEntity.notFound().build();
    }

    /**
     * Metodo para crear nuevos objetos tipo Laptop en la base de datos
     * @param laptop
     * @return
     */
    @PostMapping("/api/laptops")
    @ApiOperation("Crear una laptop nueva en base de datos")
    public Laptop  createBook(@RequestBody Laptop laptop){
        //Guarda en base de datos un objeto laptop desde un JSON
        return laptopRepository.save(laptop);
    }

    /**
     * Metodo para actualización de objetos tipo laptop en base de datos
     * @param laptop
     * @return
     */
    @PutMapping("/api/laptops")
    @ApiOperation("Actualizar una laptop existente en base de datos")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        if(laptop.getId() == null){
            log.warn("trying to update a non existing laptop");
            return ResponseEntity.badRequest().build();
        }
        if(!laptopRepository.existsById(laptop.getId())){
            log.warn("trying to update a non existent laptop");
            return ResponseEntity.notFound().build();
        }
        Laptop result = laptopRepository.save(laptop);
        return ResponseEntity.ok(result);
    }

    /**
     * Metedo para eliminar una laptop a partir de su llave primaria
     * @param id
     * @return
     */
    @DeleteMapping("api/laptops/{id}")
    @ApiOperation("Eliminar una laptop existente en base en datos")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        if(!laptopRepository.existsById(id)){
            log.warn("trying to delete a non existing laptop");
            return ResponseEntity.notFound().build();
        }
        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * Elimina todos los elementos de la base de datos
     * @return
     */
    @ApiOperation("Eliminar todos lo elementos de la base de datos")
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
