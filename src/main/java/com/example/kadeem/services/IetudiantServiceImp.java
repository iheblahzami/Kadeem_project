package com.example.kadeem.services;

import com.example.kadeem.entities.Contrat;
import com.example.kadeem.entities.Departement;
import com.example.kadeem.entities.Equipe;
import com.example.kadeem.entities.Etudiant;
import com.example.kadeem.repositories.ContratRepository;
import com.example.kadeem.repositories.DepartementRepository;
import com.example.kadeem.repositories.EquipeRepository;
import com.example.kadeem.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IetudiantServiceImp implements IetudiantService {
    @Autowired
    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository ;
    @Autowired
    private ContratRepository contratRepository;
    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public List<Etudiant> getEtudiantList() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant addorUpdateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiantById(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void deleteEtudainteById(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
    public Etudiant assignEtudiantToDepartement (Integer etudiantId, Integer departementId) {
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);
        etudiant.setDepartement(departement);
        return  etudiantRepository.save(etudiant);

    }
    public Etudiant addAndAssignEtudiantToContractAndEquipe ( Etudiant e , Integer idEquipe , Integer idContrat ){
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Departement departement = departementRepository.findById(e.getDepartement().getIdDepart()).orElse(null);

        e.setDepartement(departement); // assign etudiant to dep
        etudiantRepository.save(e);


        contrat.setEtudiants(e); // assign etudiant to contrat
        contratRepository.save(contrat);

        List <Equipe> equipes = new ArrayList<>(); // add and assign etudiant to equipe
        equipes.add(equipe);
        e.setEquipes(equipes);
        return e ;
    }

}
