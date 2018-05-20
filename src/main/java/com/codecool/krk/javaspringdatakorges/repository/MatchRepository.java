package com.codecool.krk.javaspringdatakorges.repository;

import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Long> {

    @Query("SELECT match.homeTeam FROM Match match")
    Iterable<Team> findBestTeam();

    @Query("SELECT m FROM Match m ORDER BY(goalsHome + goalsAway) DESC")
    Iterable<Match> findMatchWithMostGoals();
}
