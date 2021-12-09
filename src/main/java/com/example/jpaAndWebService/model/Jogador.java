package com.example.jpaAndWebService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Jogador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;
    
    private String team;

    public Jogador(String firstName,String lastName,String team){
        this.firstName=firstName;
        this.lastName=lastName;
        this.team=team;
    }

    @Override
    public String toString() {
        return String.format("Jogador=[Id: %d, Nome: %s %s, Jogando pelo: %s]",id,firstName,lastName,team);
    }
}
