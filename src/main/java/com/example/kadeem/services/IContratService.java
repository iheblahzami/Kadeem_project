package com.example.kadeem.services;

import com.example.kadeem.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addorUpdateContrat(Contrat contrat);

    List<Contrat> getContrat();

    void  deleteContrat(Integer idContrat);

    Contrat getContratById(Integer idContrat);
}
