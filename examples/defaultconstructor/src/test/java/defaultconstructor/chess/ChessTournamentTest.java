package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    @Test
    void testCreate() {
        ChessTournament chessTournament = new ChessTournament();

        assertEquals(3, chessTournament.getTeams().size());
    }

    @Test
    void testAddPlayersToTeams() {
        ChessTournament chessTournament = new ChessTournament();
        Player playerA = new Player();
        playerA.setName("A");
        playerA.setEmail("a@a.com");
        Player playerB = new Player();
        playerB.setName("B");
        playerB.setEmail("b@b.com");
        Player playerC = new Player();
        playerC.setName("C");
        playerC.setEmail("c@c.com");
        Player playerD = new Player();
        playerD.setName("D");
        playerD.setEmail("d@d.com");
        Player playerE = new Player();
        playerE.setName("E");
        playerE.setEmail("e@e.com");
        Player playerF = new Player();
        playerF.setName("F");
        playerF.setEmail("f@f.com");
        Player playerG = new Player();
        playerG.setName("G");
        playerG.setEmail("g@g.com");

        List<Player> playersList = Arrays.asList(
                playerA, playerB, playerC, playerD, playerE, playerF, playerG
        );
        chessTournament.addPlayersToTeams(playersList);

        assertEquals("D", chessTournament.getTeams().get(1).getPlayerTwo().getName());
        assertEquals("e@e.com", chessTournament.getTeams().get(2).getPlayerOne().getEmail());
    }

    @Test
    void testAddPlayersToTeamsFewerPlayers() {
        ChessTournament chessTournament = new ChessTournament();
        Player playerA = new Player();
        playerA.setName("A");
        playerA.setEmail("a@a.com");
        Player playerB = new Player();
        playerB.setName("B");
        playerB.setEmail("b@b.com");
        Player playerC = new Player();
        playerC.setName("C");
        playerC.setEmail("c@c.com");

        List<Player> playersList = Arrays.asList(
                playerA, playerB, playerC
        );
        chessTournament.addPlayersToTeams(playersList);

        assertEquals("B", chessTournament.getTeams().get(0).getPlayerTwo().getName());
        assertNull(chessTournament.getTeams().get(2).getPlayerOne());
    }
}