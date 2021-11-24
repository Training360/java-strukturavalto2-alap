package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void testCreate() {
        Team team = new Team();

        assertNull(team.getPlayerOne());
        assertNull(team.getPlayerTwo());
    }

    @Test
    void testSetPlayers() {
        Player firstPlayer = new Player();
        firstPlayer.setName("Kiss József");
        firstPlayer.setEmail("kissj@gmail.com");
        Player secondPlayer = new Player();
        secondPlayer.setName("Nagy Béla");
        secondPlayer.setEmail("nagyb@gmail.com");
        Team team = new Team();
        team.setPlayerOne(firstPlayer);
        team.setPlayerTwo(secondPlayer);

        assertEquals("Kiss József", team.getPlayerOne().getName());
        assertEquals("nagyb@gmail.com", team.getPlayerTwo().getEmail());
    }
}