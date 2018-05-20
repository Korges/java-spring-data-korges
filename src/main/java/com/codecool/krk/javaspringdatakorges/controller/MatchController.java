package com.codecool.krk.javaspringdatakorges.controller;

import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;
import com.codecool.krk.javaspringdatakorges.service.MatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/match")
public class MatchController {

    private final MatchServiceImpl service;

    @Autowired
    public MatchController(MatchServiceImpl service) {

        this.service = service;
    }

    @ResponseBody
    @GetMapping("/all")
    public Iterable<Match> getAll() {

        return service.getAll();
    }

    @ResponseBody
    @GetMapping("/best")
    public Iterable<Team> findBestTeam() {

        return service.findBestTeam();
    }

}
