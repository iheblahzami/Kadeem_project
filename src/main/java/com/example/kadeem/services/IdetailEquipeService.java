package com.example.kadeem.services;

import com.example.kadeem.entities.DetailEquipe;

import java.util.List;

public interface IdetailEquipeService {
    List<DetailEquipe> getDetailEquipeList();

    DetailEquipe addorUpdateDetailEquipe(DetailEquipe detailEquipe);

    DetailEquipe getDetailequipeById(Integer idDetailEquipe);

    void deleteDetailequipeById(Integer idDetailEquipe);
}
