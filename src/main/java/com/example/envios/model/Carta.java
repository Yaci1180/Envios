package com.example.envios.model;

import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value=EnvioType.Values.CARTA)
@NoArgsConstructor
public class Carta extends AbstractEnvio {

    public void setParams(Persona remitente, Persona destinatario) {
        super.setRemitente(remitente);
        super.setDestinatario(destinatario);
    }
}
