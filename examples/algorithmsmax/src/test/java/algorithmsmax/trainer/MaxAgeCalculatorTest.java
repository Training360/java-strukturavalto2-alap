package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAgeCalculatorTest {

    @Test
    void testGetTrainerWithMaxAge() {
        List<Trainer> trainers = Arrays.asList(new Trainer("John Doe", 65),
                new Trainer("Jane Doe", 52),
                new Trainer("Jack Doe", 19),
                new Trainer("Jonathan Doe", 72),
                new Trainer("Jessie Doe", 33));
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        Trainer expected = maxAgeCalculator.getTrainerWithMaxAge(trainers);

        assertEquals("Jonathan Doe", expected.getName());
        assertEquals(72, expected.getAge());
    }
}