package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo;

    @BeforeEach
    void setUp() {
        List<Animal> animals = Arrays.asList(new Animal("zsiráf", 4),
                new Animal("oroszlán", 4),
                new Animal("katicabogár", 6),
                new Animal("kígyó", 0),
                new Animal("elefánt", 4),
                new Animal("százlábú", 100),
                new Animal("farkas", 4));
        zoo = new Zoo(animals);
    }

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        List<Animal> expected = zoo.getAnimalsWithNumberOfLegsGiven(4);

        assertEquals(4, expected.size());
    }
}