package com.example.kadeem.controller;

import com.example.kadeem.entities.Departement;
import com.example.kadeem.entities.Equipe;
import com.example.kadeem.services.IdepartementService;
import com.example.kadeem.services.IequipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/departement")
@RestController
public class DepartementRestController  {
    @Autowired
    IdepartementService idepartementService;
@GetMapping("/getall")
    List<Departement> getDepartementList() {
        return idepartementService.getDepartementList();
    }
@PostMapping("/add")
    Departement addDepartement(Departement departement){
        return idepartementService.addorUpdateDepartement(departement);
    }
    @PutMapping("/update")
    Departement UpdateDepartement(Departement departement){
        return idepartementService.addorUpdateDepartement(departement);
    }
@GetMapping("/get/{id}")
    Departement getDepartementById(Integer idDepart){
    return idepartementService.getDepartementById(idDepart);
    }
@DeleteMapping("/delete/{id}")
    void deleteDepartementById(Integer idDepart){
    idepartementService.deleteDepartementById(idDepart);
    }


}
