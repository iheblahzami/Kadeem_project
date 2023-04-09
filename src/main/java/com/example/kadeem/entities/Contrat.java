package com.example.kadeem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idContrat;
    public Date dateDebutContrat;
    public Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    public Specialite specialite ;
    private Boolean archive ;
    Integer montatnContrat;
    @ManyToOne
    Etudiant etudiants;
}
