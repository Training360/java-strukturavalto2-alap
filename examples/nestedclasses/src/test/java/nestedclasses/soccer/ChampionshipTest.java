package nestedclasses.soccer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChampionshipTest {

    List<TeamStatistics> teamStatistics;

    @BeforeEach
    void init() {
        Championship championship = new Championship();
        championship.addGame(new Championship.GameResult("Real", "Barcelona", 2, 2));
        championship.addGame(new Championship.GameResult("Atletico", "Valencia", 0, 2));
        championship.addGame(new Championship.GameResult("Real", "Atletico", 1, 0));
        championship.addGame(new Championship.GameResult("Valencia", "Barcelona", 1, 2));
        teamStatistics = championship.getLeagueTable();
    }

    @Test
    void testAddGame() {
        assertTrue(teamStatistics.contains(new TeamStatistics("Real")));
        assertTrue(teamStatistics.contains(new TeamStatistics("Barcelona")));
        assertTrue(teamStatistics.contains(new TeamStatistics("Atletico")));
        assertTrue(teamStatistics.contains(new TeamStatistics("Valencia")));
    }

    @Test
    void testOneTeam() {
        int index = teamStatistics.indexOf(new TeamStatistics("Valencia"));
        TeamStatistics valencia = teamStatistics.get(index);

        assertEquals(2, valencia.getPlayed());
        assertEquals(1, valencia.getWon());
        assertEquals(1, valencia.getLost());
        assertEquals(0, valencia.getTied());
        assertEquals(3, valencia.getGoalsfor());
        assertEquals(2, valencia.getGoalsAgainst());
        assertEquals(3, valencia.getPoints());
    }
}