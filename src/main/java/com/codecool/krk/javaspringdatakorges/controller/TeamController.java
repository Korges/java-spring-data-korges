package com.codecool.krk.javaspringdatakorges.controller;

import com.codecool.krk.javaspringdatakorges.model.Team;
import com.codecool.krk.javaspringdatakorges.service.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/team")
public class TeamController {

    private final TeamServiceImpl service;

    @Autowired
    public TeamController(TeamServiceImpl service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/all")
    public Iterable<Team> getAll() {
        return service.getAll();
    }

    @ResponseBody
    @GetMapping("/find")
    public Iterable<Team> findBySubString(@RequestParam(value = "name") String subString) {
        return service.findBySubString(subString);
    }

    @ResponseBody
    @GetMapping("/appearance")
    public Iterable<Team> findByMoreThanOneAppearance() {
        return service.findByMoreThanOneAppearance();
    }

}
