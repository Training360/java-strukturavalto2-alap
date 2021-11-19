package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    static final double SAMPLE_MASS = 70;
    static final double SAMPLE_HEIGHT = 1.7;
    static final double SAMPLE_MASS_UNDER = 60;
    static final double SAMPLE_HEIGHT_UNDER = 1.9;
    static final double SAMPLE_MASS_OVER = 90;
    static final double SAMPLE_HEIGHT_OVER = 1.6;

    @Test
    void testCreate() {
        BodyMass bm = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);

        assertEquals(SAMPLE_MASS, bm.getWeight());
        assertEquals(SAMPLE_HEIGHT, bm.getHeight());
    }

    @Test
    void testGetBodyMassIndex() {
        BodyMass bm = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);

        double expectedBmi = SAMPLE_MASS / (SAMPLE_HEIGHT * SAMPLE_HEIGHT);
        assertEquals(expectedBmi, bm.getBodyMassIndex());
    }

    @Test
    void testGetBody() {
        BodyMass bm = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);
        BodyMass bmUnder = new BodyMass(SAMPLE_MASS_UNDER, SAMPLE_HEIGHT_UNDER);
        BodyMass bmOver = new BodyMass(SAMPLE_MASS_OVER, SAMPLE_HEIGHT_OVER);

        assertEquals(BmiCategory.NORMAL, bm.getBody());
        assertEquals(BmiCategory.UNDERWEIGHT, bmUnder.getBody());
        assertEquals(BmiCategory.OVERWEIGHT, bmOver.getBody());
    }

    @Test
    void testIsThinnerThan() {
        BodyMass bm = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);
        BodyMass bmUnder = new BodyMass(SAMPLE_MASS_UNDER, SAMPLE_HEIGHT_UNDER);

        assertFalse(bm.isThinnerThan(bmUnder));
        assertTrue(bmUnder.isThinnerThan(bm));
        assertFalse(bm.isThinnerThan(bm));
    }
}