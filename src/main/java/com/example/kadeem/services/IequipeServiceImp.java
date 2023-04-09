package com.example.kadeem.services;

import com.example.kadeem.entities.Equipe;
import com.example.kadeem.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IequipeServiceImp implements IequipeService{
    @Autowired
    EquipeRepository equipeRepository ;
    @Override
    public List <Equipe> getEquipesList(){
        return (List<Equipe>) equipeRepository.findAll();
    }
@Override
    public Equipe addorUpdateEquipe(Equipe equipe){
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe getEquipeById(Integer idEquipe){
        return equipeRepository.findById(idEquipe).orElse(null);
}
@Override
public void delelteEquipeById (Integer idEquipe){
        equipeRepository.deleteById(idEquipe);
}

}
