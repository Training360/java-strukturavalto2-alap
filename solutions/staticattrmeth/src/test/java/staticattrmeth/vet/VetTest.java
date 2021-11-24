package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void testAddDog() {
        Vet firstVet = new Vet();
        firstVet.addDog(new Dog("Buksi", 8, Species.GERMAN_SHEPHERD));
        firstVet.addDog(new Dog("Morzsi", 3, Species.BEAGLE));
        firstVet.addDog(new Dog("Cézár", 4, Species.LABRADOR));

        Vet secondVet = new Vet();
        secondVet.addDog(new Dog("Rex", 7, Species.GERMAN_SHEPHERD));
        secondVet.addDog(new Dog("Lady", 1, Species.GOLDEN_RETRIEVER));

        firstVet.addDog(new Dog("Mackó", 13, Species.MIXTURE));
        secondVet.addDog(new Dog("Folti", 10, Species.MIXTURE));

        long number = secondVet.getDogs().get(2).getCodeNumber();

        assertEquals(7L, number);
    }
}