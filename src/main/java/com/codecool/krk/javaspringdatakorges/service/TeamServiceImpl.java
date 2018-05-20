package com.codecool.krk.javaspringdatakorges.service;

import com.codecool.krk.javaspringdatakorges.model.Team;
import com.codecool.krk.javaspringdatakorges.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository repository;

    @Autowired
    public TeamServiceImpl(TeamRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Team> getAll() {

        return repository.findAll();
    }

    @Override
    public Iterable<Team> findBySubString(String subString) {

        return repository.findAllByNameContains(subString);
    }

    @Override
    public Iterable<Team> findByMoreThanOneAppearance() {
        return repository.findByMoreThanOneAppearance();
    }

}
