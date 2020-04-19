package com.example.envios.controllers;

import com.example.envios.model.Envio;
import com.example.envios.services.EnvioService;
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
    public ResponseEntity<Envio> saveCarta(Long remitenteId, Long destinatarioId) {

        return ResponseEntity.ok(envioService.saveCarta(remitenteId, destinatarioId));
    }

    @PostMapping(value = "/savePaquete")
    public ResponseEntity<Envio> savePaquete(double peso, double alto, double ancho, Long remitenteId, Long destinatarioId) {

        return ResponseEntity.ok(envioService.savePaquete(peso,alto,ancho,remitenteId,destinatarioId));
    }
}
