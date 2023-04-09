package com.example.kadeem.controller;


import com.example.kadeem.entities.Universite;

import com.example.kadeem.services.IuniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/universite")
@RestController
public class UniversityRestController {
    @Autowired
    IuniversiteService iuniversiteService;
    @GetMapping("/getall")
    List<Universite> getUniversiteList() {
        return iuniversiteService.getUniversiteList();
    }
    @PostMapping("/add")
    Universite addorUpdateEtudiant(Universite universite){
        return iuniversiteService.addorUniversite(universite);
    }
    @PutMapping("/update")
    Universite UpdateEtudiant(Universite universite){
        return iuniversiteService.addorUniversite(universite);
    }
    @GetMapping("/get/{id}")
    Universite getUniversiteById(@PathVariable("id") Integer idUniv){
        return iuniversiteService.getUniversiteById(idUniv);
    }
    @DeleteMapping("/delete/{id}")
    void deleteUniversiteById(@PathVariable ("id") Integer idUniv){
        iuniversiteService.deleteUniversiteById(idUniv);
    }

    public void assignUniversiteToDepartement(@PathVariable("iddeb") Integer iddeb ,@PathVariable("iduniv") Integer iduniv){
iuniversiteService.assignUniversiteToDepartement(iddeb,iduniv);
    }
}
