package com.example.kadeem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetailEquipe ;
    private Integer salle ;
    private String thematique ;
    @OneToOne
    Equipe equipes ;
}
