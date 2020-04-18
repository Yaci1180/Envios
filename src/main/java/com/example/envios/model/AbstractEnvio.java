package com.example.envios.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "envio")
@DiscriminatorColumn(name="envio_type", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter @Setter
public abstract class AbstractEnvio implements Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double peso;
    private double ancho;
    private double alto;
    private String destinatario;
    private String remitente;

    @Column(name = "envio_type", insertable = false, updatable = false)
    private String envioType;
}
