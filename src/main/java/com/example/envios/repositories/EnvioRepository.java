package com.example.envios.repositories;

import com.example.envios.model.AbstractEnvio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvioRepository extends JpaRepository<AbstractEnvio, Long> {

}
