package com.tavares.demo.services;

import com.tavares.demo.models.EstudanteModels;
import com.tavares.demo.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModels criarEstudante(EstudanteModels estudanteModels){
        return estudanteRepository.save(estudanteModels);
    }

    public List<EstudanteModels> findAll(){
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }
}
