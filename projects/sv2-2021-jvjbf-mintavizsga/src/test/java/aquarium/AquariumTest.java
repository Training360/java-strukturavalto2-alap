package aquarium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AquariumTest {

    Aquarium aquarium;
    Fish clownfish;
    Fish tang;
    Fish kong;

    @BeforeEach
    void init() {
        clownfish = new Clownfish("Nemo", 5, "orange-white");
        tang = new Tang("Dory", 6, "blue");
        kong = new Kong("Kong", 10, "black");
        aquarium = new Aquarium();
        aquarium.addFish(clownfish);
        aquarium.addFish(tang);
        aquarium.addFish(kong);
    }

    @Test
    void testCapacity() {
        assertEquals(20, Aquarium.CAPACITY);
    }

    @Test
    void testGetStatusWithEmptyAquarium() {
        assertEquals(0, new Aquarium().getStatus().size());
    }

    @Test
    void testAddOneFish() {
        Clownfish otherClownfish = new Clownfish("Nemo2", 5, "orange-white");
        aquarium.addFish(otherClownfish);

        assertEquals(4, aquarium.getStatus().size());
    }

    @Test
    void testAddTwoFish() {
        Clownfish otherClownfish = new Clownfish("Nemo2", 5, "orange-white");
        aquarium.addFish(otherClownfish);
        Clownfish anotherClownfish = new Clownfish("Nemo3", 5, "orange-white");

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> aquarium.addFish(anotherClownfish));
        assertEquals("Can not add fish because there is no more space.", ex.getMessage());
    }

    @Test
    void testGetStatusWithThreeFish() {
        assertEquals(3, aquarium.getStatus().size());
        assertEquals("Nemo, weight: 5, color: orange-white, short-term memory loss: false", aquarium.getStatus().get(0));
        assertEquals("Dory, weight: 6, color: blue, short-term memory loss: true", aquarium.getStatus().get(1));
        assertEquals("Kong, weight: 10, color: black, short-term memory loss: false", aquarium.getStatus().get(2));
    }

    @Test
    void testRemoveFishDontHaveBiggerFishThanParameter() {
        aquarium.removeFish(11);

        assertEquals(3, aquarium.getStatus().size());
    }

    @Test
    void testRemoveFish() {
        aquarium.removeFish(9);

        assertEquals(2, aquarium.getStatus().size());
    }

    @Test
    void testFeed() {
        aquarium.feed();

        assertEquals("Nemo, weight: 6, color: orange-white, short-term memory loss: false", aquarium.getStatus().get(0));
        assertEquals("Dory, weight: 7, color: blue, short-term memory loss: true", aquarium.getStatus().get(1));
        assertEquals("Kong, weight: 12, color: black, short-term memory loss: false", aquarium.getStatus().get(2));
    }

    @Test
    void testGetNumberOfFishWithMemoryLoss() {
        assertEquals(1, aquarium.getNumberOfFishWithMemoryLoss());
    }

    @Test
    void testIsThereFishWithGivenColor() {
        assertEquals(true, aquarium.isThereFishWithGivenColor("blue"));
        assertEquals(false, aquarium.isThereFishWithGivenColor("xyz"));
    }

    @Test
    void testGetSmallestFish() {
        assertEquals(clownfish, aquarium.getSmallestFish());
    }
}
