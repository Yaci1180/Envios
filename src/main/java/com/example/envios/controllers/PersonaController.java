package com.example.envios.controllers;

import com.example.envios.model.Persona;
import com.example.envios.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/cearPersona")
    public ResponseEntity<Persona> cearPersona(String nombre, String apellido, String direccion){

        return ResponseEntity.ok(personaService.createPersona(nombre, apellido, direccion));
    }

    @GetMapping("verPersonas")
    public ResponseEntity<List<Persona>> verPersonas(){

        return ResponseEntity.ok(personaService.verPersonas());
    }
}
