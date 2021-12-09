package com.example.jpaAndWebService.repository;

import com.example.jpaAndWebService.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    List<Jogador> findByTeam(String team);

    Jogador findById(long id);
}
