package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {

    @Test
    void getSetName() {
        final String name = "Kovács Anna";
        Human human = new Human();
        human.setName(name);

        assertEquals(name, human.getName());
    }

    @Test
    void getSetWeight() {
        final double weight = 62.3;
        Human human = new Human();
        human.setWeight(weight);

        assertEquals(weight, human.getWeight());
    }

    @Test
    void getSetIQ() {
        final int iq = 123;
        Human human = new Human();
        human.setIq(iq);

        assertEquals(iq, human.getIq());
    }
}