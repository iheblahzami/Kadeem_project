package com.example.kadeem.repositories;

import com.example.kadeem.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository extends CrudRepository<Etudiant, Integer> {
}