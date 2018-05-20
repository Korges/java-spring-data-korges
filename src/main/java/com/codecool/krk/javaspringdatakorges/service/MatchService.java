package com.codecool.krk.javaspringdatakorges.service;

import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;

public interface MatchService {

    Iterable<Match> getAll();
    Iterable<Team> findBestTeam();
    Iterable<Match> findMatchWithMostGoals();
}
