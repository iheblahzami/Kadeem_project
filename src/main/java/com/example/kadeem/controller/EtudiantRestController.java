package com.example.kadeem.controller;

import com.example.kadeem.entities.Etudiant;
import com.example.kadeem.services.IetudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/etudiant")
@RestController
public class EtudiantRestController {
    @Autowired
 private   IetudiantService ietudiantService ;
@GetMapping("/getall")
    List<Etudiant> getEtudiantList() {
        return ietudiantService.getEtudiantList();
    }
@PostMapping("/add")
    Etudiant addEtudiant(Etudiant etudiant){
        return ietudiantService.addorUpdateEtudiant(etudiant);
    }
    @PutMapping("/update")
    Etudiant UpdateEtudiant(Etudiant etudiant){
        return ietudiantService.addorUpdateEtudiant(etudiant);
    }
@GetMapping("/get/{id}")
    Etudiant getEtudiantById(@PathVariable ("id") Integer idEtudiant){
        return ietudiantService.getEtudiantById(idEtudiant);
    }
@DeleteMapping("/delete/{id}")
    void deleteEtudainteById(@PathVariable ("id") Integer idEtudiant){
        ietudiantService.deleteEtudainteById(idEtudiant);
    }

    @PutMapping("/assignEtudiantToDepartement/{idetudiant}/{iddepartement}")
    Etudiant assignEtudiantToDepartement (@PathVariable ("idetudiant") Integer etudiantId, @PathVariable("iddepartement") Integer departementId) {
    return ietudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }

    @PutMapping("/addAndAssignEtudiantToEquipeAndContract/{idContrat}/{idEquipe}")
    Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,
                                                   @PathVariable("idContrat")  Integer idContrat,
                                                    @PathVariable("idEquipe") Integer idEquipe){
    return  ietudiantService.addAndAssignEtudiantToContractAndEquipe(e,idEquipe,idContrat);
    }
}
