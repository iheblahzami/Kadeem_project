package com.example.kadeem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Integer idEtudiant ;
    private String  prenomE;
    private String nomE ;
    @Enumerated(EnumType.STRING)
    private Option option ;
    @OneToMany(mappedBy = "etudiants")
    List<Contrat>contrats;
    @ManyToMany(mappedBy = "etudiant")
    List<Equipe>equipes;
    @ManyToOne(cascade = CascadeType.PERSIST)
    Departement departement;
}
