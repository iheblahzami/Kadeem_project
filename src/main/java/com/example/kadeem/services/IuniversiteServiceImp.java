package com.example.kadeem.services;

import com.example.kadeem.entities.Departement;
import com.example.kadeem.entities.Universite;
import com.example.kadeem.repositories.DepartementRepository;
import com.example.kadeem.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IuniversiteServiceImp implements IuniversiteService{
    @Autowired
    UniversiteRepository universiteRepository ;
    DepartementRepository  departementRepository;
  @Override
     public List<Universite> getUniversiteList(){
         return  (List<Universite>) universiteRepository.findAll();
     }

     @Override
    public Universite addorUniversite(Universite universite){
      return universiteRepository.save(universite);
     }
     @Override
    public  Universite getUniversiteById(Integer idUniv){
      return universiteRepository.findById(idUniv).orElse(null);
     }
     @Override
    public void deleteUniversiteById (Integer idUniv){
      universiteRepository.deleteById(idUniv);
     }
     public void assignUniversiteToDepartement(Integer iddeb , Integer iduniv){
      Universite univ1 = universiteRepository.findById(iduniv).orElse(null);
         Departement dep1 = departementRepository.findById(iddeb).orElse(null);
if (univ1.getDepartements()==null){
    List<Departement>  departements = new ArrayList<>();
    departements.add(dep1);
    univ1.setDepartements(departements);
}
else {
    univ1.getDepartements().add(dep1);
}
universiteRepository.save(univ1);
     }
}
