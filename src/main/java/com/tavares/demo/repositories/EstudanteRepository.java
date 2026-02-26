package com.tavares.demo.repositories;

import com.tavares.demo.models.EstudanteModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModels, Long> {
}
