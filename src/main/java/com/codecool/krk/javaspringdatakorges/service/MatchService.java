package com.codecool.krk.javaspringdatakorges.service;

import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;

import java.util.Optional;

public interface MatchService {

    Iterable<Match> getAll();
    Iterable<Team> findBestTeam();
    Iterable<Match> findMatchWithMostGoals();
    Optional<Match> getById(Long id);
    void save(Match match);
    void remove(Long id);
    void removeAll();
}
