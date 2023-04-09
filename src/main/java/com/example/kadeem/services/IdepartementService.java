package com.example.kadeem.services;

import com.example.kadeem.entities.Departement;

import java.util.List;

public interface IdepartementService {
    List<Departement> getDepartementList();

    Departement addorUpdateDepartement(Departement departement);

    Departement getDepartementById(Integer idDepart);

    void deleteDepartementById(Integer idDepart);
}
