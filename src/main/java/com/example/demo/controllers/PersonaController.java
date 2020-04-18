package com.example.demo.controllers;

import com.example.demo.model.Persona;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonaController {


    public PersonaController(Persona persona) {
        this.persona = persona;

        public ResponseEntity<Persona> cearPersona (Persona persona){

            return ResponseEntity.ok(personaRepository.save(this.persona));
        }
    }
}
