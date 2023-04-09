package com.example.kadeem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipe ;
    private String nomEquipe ;
    @Enumerated(EnumType.STRING)
    Niveau niveau;
    @ManyToMany
    List<Etudiant>etudiant;
    @OneToOne(mappedBy = "equipes")
    DetailEquipe detailEquipe;
}
