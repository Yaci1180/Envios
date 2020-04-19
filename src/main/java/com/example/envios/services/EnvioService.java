package com.example.envios.services;

import com.example.envios.model.Envio;
import com.example.envios.model.Persona;

public interface EnvioService {

    Envio saveCarta(Long remitenteId, Long destinatarioId);
    Envio savePaquete(double peso, double alto, double ancho, Long remitenteId, Long destinatarioId);

}
