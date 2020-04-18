package com.example.demo.services;

import com.example.demo.model.Envio;

public interface EnvioService {

    Envio saveCarta(String remitente, String destinatario);
    Envio savePaquete(double peso, double alto, double ancho, String remitente, String destinatario);

}
