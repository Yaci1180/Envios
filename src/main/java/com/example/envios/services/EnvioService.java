package com.example.envios.services;

import com.example.envios.model.Envio;

public interface EnvioService {

    Envio saveCarta(String remitente, String destinatario);
    Envio savePaquete(double peso, double alto, double ancho, String remitente, String destinatario);

}
