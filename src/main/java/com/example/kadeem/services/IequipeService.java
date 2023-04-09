package com.example.kadeem.services;

import com.example.kadeem.entities.Equipe;

import java.util.List;

public interface IequipeService {
    List<Equipe> getEquipesList();

    Equipe addorUpdateEquipe(Equipe equipe);

    Equipe getEquipeById(Integer idEquipe);

    void delelteEquipeById(Integer idEquipe);
}
