package com.tavares.demo.controllers;

import com.tavares.demo.models.EstudanteModels;
import com.tavares.demo.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModels criarEstudante(@RequestBody EstudanteModels estudanteModels){
        return estudanteService.criarEstudante(estudanteModels);
    }

    @GetMapping
    public List<EstudanteModels> buscarTodosEstudantes(){
        return estudanteService.findAll();
    }

    @DeleteMapping
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }
}
