package com.example.kadeem.services;

import com.example.kadeem.entities.DetailEquipe;
import com.example.kadeem.repositories.DetailEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdetailequipeServiceImp implements IdetailEquipeService{
    @Autowired
    DetailEquipeRepository detailEquipeRepository;

    @Override
    public List<DetailEquipe> getDetailEquipeList(){
        return (List<DetailEquipe>) detailEquipeRepository.findAll();
    }
    @Override
    public DetailEquipe addorUpdateDetailEquipe(DetailEquipe detailEquipe){
        return detailEquipeRepository.save(detailEquipe);
    }
    @Override
    public DetailEquipe getDetailequipeById (Integer idDetailEquipe){
        return detailEquipeRepository.findById(idDetailEquipe).orElse(null);
    }
    @Override
    public void deleteDetailequipeById(Integer idDetailEquipe) {
        detailEquipeRepository.deleteById(idDetailEquipe);
    }
}

