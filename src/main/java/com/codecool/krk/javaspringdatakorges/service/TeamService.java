package com.codecool.krk.javaspringdatakorges.service;

import com.codecool.krk.javaspringdatakorges.model.Team;

import java.util.Optional;

public interface TeamService {

    Iterable<Team> getAll();
    Iterable<Team> findBySubString(String subString);
    Iterable<Team> findByMoreThanOneAppearance();
    Optional<Team> getById(Long id);
    void create(Team team);
}
