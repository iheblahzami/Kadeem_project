package com.example.kadeem.controller;

import com.example.kadeem.entities.Contrat;
import com.example.kadeem.services.IContratService;
import com.example.kadeem.services.IContratServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/Contrat")
@RestController
public class ContratRestController {
    @Autowired
    IContratService iContratService;

    @PostMapping("/add")
    Contrat addorUpdateContrat(@RequestBody Contrat contrat) {
        return iContratService.addorUpdateContrat(contrat);
    }
    @PutMapping("/update")
    Contrat UpdateContrat(@RequestBody Contrat contrat) {
        return iContratService.addorUpdateContrat(contrat);
    }

    @GetMapping("/get")
    List<Contrat> getContrat() {
        return iContratService.getContrat();
    }

    @GetMapping("/get/{id}")
    Contrat getContratById(@PathVariable ("id") Integer idContrat) {
        return iContratService.getContratById(idContrat);
    }

    @DeleteMapping("/delete/{id}")
    void  deleteContrat(@PathVariable ("id") Integer idContrat){
        iContratService.deleteContrat(idContrat);
    }
}