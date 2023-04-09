package com.example.kadeem.controller;

import com.example.kadeem.entities.Equipe;

import com.example.kadeem.services.IequipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/equipe")
@RestController
public class EquipeRestController  {
    @Autowired
    IequipeService iequipeService;
    @GetMapping("/getall")
    List<Equipe> getEtudiantList() {
        return iequipeService.getEquipesList();
    }
    @PostMapping("/add")
    Equipe addEquipe(Equipe equipe){
        return iequipeService.addorUpdateEquipe(equipe);
    }
    @PutMapping("/update")
    Equipe UpdateEquipe(Equipe equipe){
        return iequipeService.addorUpdateEquipe(equipe);
    }
    @GetMapping("/get/{id}")
    Equipe getEquipeById(@PathVariable("id") Integer idEquipe){
        return iequipeService.getEquipeById(idEquipe);
    }
    @DeleteMapping("/delete/{id}")
    void delelteEquipeById(@PathVariable ("id") Integer idEquipe){
        iequipeService.delelteEquipeById(idEquipe);
    }
}
