package com.example.kadeem.services;

import com.example.kadeem.entities.Universite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IuniversiteService {


    List<Universite> getUniversiteList();

    Universite addorUniversite(Universite universite);

    Universite getUniversiteById(Integer idUniv);

    void deleteUniversiteById(Integer idUniv);
    public void assignUniversiteToDepartement(Integer iddeb , Integer iduniv);
}
