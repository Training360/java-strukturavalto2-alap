package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testCreate() {
        Dog dog = new Dog("Buksi", 8, Species.GERMAN_SHEPHERD);

        assertEquals("Buksi", dog.getName());
        assertEquals(8, dog.getAge());
        assertEquals(Species.GERMAN_SHEPHERD, dog.getSpecies());
        assertEquals(0L, dog.getCodeNumber());
    }
}