package com.example.demo.controllers;

import com.example.demo.model.Envio;
import com.example.demo.model.Paquete;
import com.example.demo.model.Persona;
import com.example.demo.services.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnvioController {

    private final EnvioService envioService;

    @Autowired
    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;

    }

    @PostMapping(value = "/saveCarta")
    public ResponseEntity<Envio> saveCircle(String remitente, String destinatario) {

        return ResponseEntity.ok(envioService.saveCarta(remitente, destinatario));
    }

    @PostMapping(value = "/savePaquete")
    public ResponseEntity<Envio> saveTriangle(double peso, double alto, double ancho, String remitente, String destinatario) {

        return ResponseEntity.ok(envioService.savePaquete(peso,alto,ancho,remitente,destinatario));
    }


/*    public List<Paquete> enviarPaquete(double peso, double alto, double ancho, String remitente, String destinatario ){

        Persona persona = Persona.builder()
                .nombre(nombre)
                .apellido(apellido)
                .direccion(direccion)
                .build();

        Paquete paquete = Paquete.builder()
                .peso(peso)
                .alto(alto)
                .ancho(ancho)
                .remitente(remitente)
                .destinatario(destinatario)
                .build();
*/
}
