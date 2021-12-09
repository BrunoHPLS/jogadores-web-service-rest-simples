package com.example.jpaAndWebService.controller;

import com.example.jpaAndWebService.model.Jogador;
import com.example.jpaAndWebService.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JogadorController {

    @Autowired
    private JogadorRepository jogadores;

    @GetMapping("/jogadores")
    public List<Jogador> listar(){
        return jogadores.findAll();
    }

    @GetMapping("/jogadores/{id}")
    public Jogador find(@PathVariable Long id){
        return jogadores.findById(id).orElse(new Jogador());
    }
}
