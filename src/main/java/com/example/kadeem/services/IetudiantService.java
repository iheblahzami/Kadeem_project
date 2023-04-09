package com.example.kadeem.services;

import com.example.kadeem.entities.Etudiant;

import java.util.List;

public interface IetudiantService {
    List<Etudiant> getEtudiantList();

    Etudiant addorUpdateEtudiant(Etudiant etudiant);

    Etudiant getEtudiantById(Integer idEtudiant);

    void deleteEtudainteById(Integer idEtudiant);
    public Etudiant assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
    public Etudiant addAndAssignEtudiantToContractAndEquipe ( Etudiant e , Integer idEquipe , Integer idContrat);
}
