package com.example.kadeem.services;

import com.example.kadeem.entities.Contrat;
import com.example.kadeem.repositories.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IContratServiceImp implements IContratService{


    @Autowired
   public  ContratRepository contratRepository;

   @Override
   public Contrat addorUpdateContrat(Contrat contrat){
        return contratRepository.save(contrat);
    }
    @Override
    public List<Contrat> getContrat(){
        return (List<Contrat>) contratRepository.findAll();
    }
    @Override
    public void  deleteContrat(Integer idContrat){
       contratRepository.deleteById(idContrat);

    }
    @Override
    public Contrat getContratById(Integer idContrat){
       return  contratRepository.findById(idContrat).orElse(null);
    }
}
