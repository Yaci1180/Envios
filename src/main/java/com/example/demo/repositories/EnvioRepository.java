package com.example.demo.repositories;

import com.example.demo.model.AbstractEnvio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvioRepository extends JpaRepository<AbstractEnvio, Long> {

}
