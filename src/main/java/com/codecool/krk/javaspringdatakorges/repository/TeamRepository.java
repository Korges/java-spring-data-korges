package com.codecool.krk.javaspringdatakorges.repository;

import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

    @Query("SELECT t FROM Team t WHERE t.name LIKE CONCAT('%',:toFind,'%')")
    Iterable<Team> findAllByNameContains(@Param("toFind") String toFind);

    @Query("SELECT team FROM Team team " +
            "JOIN Match match ON match.awayTeam = team.teamId " +
            "OR match.homeTeam = team.teamId " +
            "GROUP BY team.teamId HAVING (COUNT(team.teamId) > 1) " +
            "ORDER BY COUNT (team.teamId) DESC")
    Iterable<Team> findByMoreThanOneAppearance();

}
