package com.example.kadeem.services;

import com.example.kadeem.entities.Departement;
import com.example.kadeem.repositories.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdepartementServiceImp implements IdepartementService{
    @Autowired
    DepartementRepository departementRepository ;

   @Override
   public  List<Departement> getDepartementList(){
       return (List<Departement>) departementRepository.findAll();
    }
    @Override
    public Departement addorUpdateDepartement(Departement departement){
       return departementRepository.save(departement);
    }
    @Override
    public Departement getDepartementById (Integer idDepart){
       return departementRepository.findById(idDepart).orElse(null);
    }
    @Override
    public void deleteDepartementById(Integer idDepart) {
       departementRepository.deleteById(idDepart);
    }
}
