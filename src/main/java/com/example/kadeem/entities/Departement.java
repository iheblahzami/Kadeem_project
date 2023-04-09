package com.example.kadeem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter

public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idDepart ;
    private String nomDepart ;

   /* public Departement() {

    }

    public Departement(Integer idDepart, String nomDepart) {
        this.idDepart = idDepart;
        this.nomDepart = nomDepart;
    }
*/
    @OneToMany(mappedBy = "departement")
    List<Etudiant>etudiants;


}
