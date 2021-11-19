package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DogTest {

    @Test
    void getSetName() {
        final String name = "Bodri";
        Dog dog = new Dog();
        dog.setName(name);

        assertEquals(name, dog.getName());
    }

    @Test
    void isSetPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(true);

        assertTrue(dog.isPedigree());
    }

    @Test
    void getSetAge() {
        final int age = 3;
        Dog dog = new Dog();
        dog.setAge(age);

        assertEquals(age, dog.getAge());
    }

    @Test
    void getSetWeight() {
        final double weight = 6.5;
        Dog dog = new Dog();
        dog.setWeight(weight);

        assertEquals(weight, dog.getWeight());
    }
}