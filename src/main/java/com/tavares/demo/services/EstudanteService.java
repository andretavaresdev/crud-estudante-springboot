package com.tavares.demo.services;

import com.tavares.demo.models.EstudanteModels;
import com.tavares.demo.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<EstudanteModels> buscarPorId(Long id){
        return estudanteRepository.findById(id);
    }

    public EstudanteModels atualizar(Long id, EstudanteModels estudanteModels){

        EstudanteModels model = estudanteRepository.findById(id).get();

        model.setNome(estudanteModels.getNome());
        model.setEmail(estudanteModels.getEmail());
        model.setIdade(estudanteModels.getIdade());

        return estudanteRepository.save(model);
    }
}
