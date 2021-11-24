package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testCreate() {
        Player player = new Player();

        assertNull(player.getName());
        assertNull(player.getEmail());
    }

    @Test
    void testSetNameAndEmail() {
        Player player = new Player();
        player.setName("Kiss József");
        player.setEmail("kissj@gmail.com");

        assertEquals("Kiss József", player.getName());
        assertEquals("kissj@gmail.com", player.getEmail());
    }
}