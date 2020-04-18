package com.example.envios.services;

<<<<<<< HEAD:src/main/java/com/example/demo/services/EnvioServiceImpl.java
import com.example.demo.model.*;
import com.example.demo.repositories.EnvioRepository;
import com.example.demo.repositories.PersonaRepository;
=======
import com.example.envios.model.*;
import com.example.envios.repositories.EnvioRepository;
>>>>>>> origin/master:src/main/java/com/example/envios/services/EnvioServiceImpl.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvioServiceImpl implements EnvioService{

    private final EnvioRepository envioRepository;
    private final EnvioFactory envioFactory;
    private final PersonaRepository personaRepository;

    @Autowired
    public EnvioServiceImpl(EnvioRepository shapeRepository,
                            EnvioFactory shapeFactory, PersonaRepository personaRepository) {
        this.envioRepository = shapeRepository;
        this.envioFactory = shapeFactory;
        this.personaRepository = personaRepository;
    }

    @Override
    public Envio saveCarta(String remitente, String destinatario) {
        Carta carta = (Carta) envioFactory.createEnvio(EnvioType.CARTA);
        carta.setParams(remitente, destinatario);

        return saveEnvio(carta);
    }

    @Override
    public Envio savePaquete(double peso, double alto, double ancho, String remitente, String destinatario) {
        Paquete paquete = (Paquete) envioFactory.createEnvio(EnvioType.PAQUETE);
        paquete.setParams(peso,alto,ancho,destinatario,remitente);

        return saveEnvio(paquete);
    }

    public Envio saveEnvio(Envio envio) {
        return envioRepository.save((AbstractEnvio) envio);
    }


}
