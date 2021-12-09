package aquarium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    Fish clownfish;
    Fish tang;
    Fish kong;

    @BeforeEach
    void init() {
        clownfish = new Clownfish("Nemo", 5, "orange-white");
        tang = new Tang("Dory", 6, "blue");
        kong = new Kong("Kong", 10, "black");
    }

    @Test
    void testClownfish() {
        assertEquals("Nemo", clownfish.getName());
        assertEquals(5, clownfish.getWeight());
        assertEquals("orange-white", clownfish.getColor());
        assertFalse(clownfish.hasMemoryLoss());
    }

    @Test
    void testTang() {
        assertEquals("Dory", tang.getName());
        assertEquals(6, tang.getWeight());
        assertEquals("blue", tang.getColor());
        assertTrue(tang.hasMemoryLoss());
    }

    @Test
    void testKong() {
        assertEquals("Kong", kong.getName());
        assertEquals(10, kong.getWeight());
        assertEquals("black", kong.getColor());
        assertFalse(kong.hasMemoryLoss());
    }

    @Test
    void testGetStatus() {
        assertEquals("Nemo, weight: 5, color: orange-white, short-term memory loss: false", clownfish.getStatus());
        assertEquals("Dory, weight: 6, color: blue, short-term memory loss: true", tang.getStatus());
        assertEquals("Kong, weight: 10, color: black, short-term memory loss: false", kong.getStatus());
    }

    @Test
    void testFeedClownfish() {
        clownfish.feed();

        assertEquals(6, clownfish.getWeight());
    }

    @Test
    void testFeedTang() {
        tang.feed();

        assertEquals(7, tang.getWeight());
    }

    @Test
    void testFeedKong() {
        kong.feed();

        assertEquals(12, kong.getWeight());
    }
}
