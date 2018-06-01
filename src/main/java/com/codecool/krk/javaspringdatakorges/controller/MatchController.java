package com.codecool.krk.javaspringdatakorges.controller;

import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;
import com.codecool.krk.javaspringdatakorges.service.MatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping("/match")
public class MatchController {

    private final MatchServiceImpl service;

    @Autowired
    public MatchController(MatchServiceImpl service) {

        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Match> getMatchById(@PathVariable Long id) {
        return service.getById(id);
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

    @ResponseBody
    @PostMapping("add")
    public Match create(@RequestBody Match match){
        service.save(match);
        return match;
    }

    @ResponseBody
    @DeleteMapping("/remove/{id}")
    public Match remove(@PathVariable Long id){

        Optional<Match> match = service.getById(id);
        service.remove(id);

        return match.orElse(null);
    }

    @ResponseBody
    @DeleteMapping("/remove")
    public void removeAll(){
        service.removeAll();
    }

}
