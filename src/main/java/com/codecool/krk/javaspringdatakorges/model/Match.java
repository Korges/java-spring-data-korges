package com.codecool.krk.javaspringdatakorges.model;

import javax.persistence.*;
import java.util.Calendar;


@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchId;

    @Temporal(TemporalType.DATE)
    private Calendar date;

    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;

    private int goalsHome;
    private int goalsAway;


    public Match() {

    }

    public Match(Calendar date, Team homeTeam, Team awayTeam, int goalsHome, int goalsAway) {

        this.date = date;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goalsHome = goalsHome;
        this.goalsAway = goalsAway;
    }

    public Long getMatchId() {
        return matchId;
    }

    public Calendar getDate() {
        return date;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getGoalsHome() {
        return goalsHome;
    }

    public int getGoalsAway() {
        return goalsAway;
    }

}
