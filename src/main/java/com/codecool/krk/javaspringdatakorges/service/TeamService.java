package com.codecool.krk.javaspringdatakorges.service;

import com.codecool.krk.javaspringdatakorges.model.Team;

public interface TeamService {

    Iterable<Team> getAll();
    Iterable<Team> findBySubString(String subString);
    Iterable<Team> findByMoreThanOneAppearance();
}
