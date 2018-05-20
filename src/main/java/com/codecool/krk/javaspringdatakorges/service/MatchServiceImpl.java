package com.codecool.krk.javaspringdatakorges.service;

import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;
import com.codecool.krk.javaspringdatakorges.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository repository;

    @Autowired
    public MatchServiceImpl(MatchRepository repository) {

        this.repository = repository;
    }

    @Override
    public Iterable<Match> getAll() {

        return repository.findAll();
    }

    @Override
    public Iterable<Team> findBestTeam() {

        return repository.findBestTeam();
    }

    @Override
    public Iterable<Match> findMatchWithMostGoals() {

        List<Match> result = new ArrayList<>();
        result.add(repository.findMatchWithMostGoals().iterator().next());
        return result;
    }

}
