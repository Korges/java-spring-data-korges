package com.codecool.krk.javaspringdatakorges.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;
    private String name;
    private String country;
    private String city;

    @OneToMany(mappedBy="homeTeam")
    private Set<Match> homeMatches;

    @OneToMany(mappedBy="awayTeam")
    private Set<Match> awayMatches;

    public Team() {

    }

    public Team(String name, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
    }

    public Long getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

}
