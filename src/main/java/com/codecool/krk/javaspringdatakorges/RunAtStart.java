package com.codecool.krk.javaspringdatakorges;


import com.codecool.krk.javaspringdatakorges.model.Match;
import com.codecool.krk.javaspringdatakorges.model.Team;
import com.codecool.krk.javaspringdatakorges.repository.MatchRepository;
import com.codecool.krk.javaspringdatakorges.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.GregorianCalendar;

@Component
public class RunAtStart {

//    private final TeamRepository teamRepository;
//    private final MatchRepository matchRepository;
//
//    @Autowired
//    public RunAtStart(TeamRepository teamRepository, MatchRepository matchRepository) {
//
//        this.teamRepository = teamRepository;
//        this.matchRepository = matchRepository;
//    }
//
//    @PostConstruct
//    public void runAtStart() {
//
//        Team team = new Team("FC Barcelona", "Spain", "Barcelona");
//        Team team2 = new Team("Manchester United", "England", "Manchester");
//        Team team3 = new Team("Chelsea Londyn", "England", "Londyn");
//        Team team4 = new Team("Real Madryt", "Spain", "Madryt");
//        Team team5 = new Team("Bayern Monachium", "Germany", "Monachium");
//        Team team6 = new Team("Juventus Turyn", "Italy", "Turyn");
//
//        teamRepository.save(team);
//        teamRepository.save(team2);
//        teamRepository.save(team3);
//        teamRepository.save(team4);
//        teamRepository.save(team5);
//        teamRepository.save(team6);
//
//
//        Match match = new Match(new GregorianCalendar(2018, 1, 2),team, team2, 1, 2);
//        Match match2 = new Match(new GregorianCalendar(2018, 3, 21),team2, team3, 0, 0);
//        Match match3 = new Match(new GregorianCalendar(2018, 2, 9),team3, team4, 3, 2);
//        Match match4 = new Match(new GregorianCalendar(2018, 5, 3),team4, team5, 2, 4);
//        Match match5 = new Match(new GregorianCalendar(2018, 7, 18),team5, team6, 0, 3);
//        Match match6 = new Match(new GregorianCalendar(2017, 6, 15),team, team6, 1, 0);
//        Match match7 = new Match(new GregorianCalendar(2017, 8, 7),team, team5, 2, 1);
//        Match match8 = new Match(new GregorianCalendar(2017, 9, 6),team2, team4, 4, 0);
//        Match match9 = new Match(new GregorianCalendar(2016, 10, 16),team3, team5, 1, 2);
//        Match match10 = new Match(new GregorianCalendar(2016, 12, 25),team4, team6, 2, 5);
//
//
//        matchRepository.save(match);
//        matchRepository.save(match2);
//        matchRepository.save(match3);
//        matchRepository.save(match4);
//        matchRepository.save(match5);
//        matchRepository.save(match6);
//        matchRepository.save(match7);
//        matchRepository.save(match8);
//        matchRepository.save(match9);
//        matchRepository.save(match10);
//
//
//    }
}
