package skirental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SkiRentalTest {

    SkiRental skiRental;

    @BeforeEach
    void init() {
        skiRental = new SkiRental();
        skiRental.loadFromFile(Paths.get("src/test/resources/skirental.txt"));
    }

    @Test
    void testLoadFromFile() {
        assertEquals(15, skiRental.getRentals().size());
        assertEquals(170, skiRental.getRentals().get("Peter Taylor").getSizeOfSkis());
        assertEquals(0, skiRental.getRentals().get("Mike Wiley").getSizeOfBoot());
    }

    @Test
    void testReadFromFileNotExistingFile() {
        skiRental = new SkiRental();

        Exception ex = assertThrows(IllegalStateException.class, () -> skiRental.loadFromFile(Paths.get("xyz.txt")));
        assertEquals("Cannot read file: xyz.txt", ex.getMessage());
    }

    @Test
    void testListChildren() {
        List<String> expected = Arrays.asList("Boy Small", "John Doe", "Ken Bold", "Ruth Norley");

        assertEquals(expected, skiRental.listChildren());
    }

    @Test
    void testGetNameOfPeopleWithBiggestFoot() {
        assertEquals("Jeff Swensson", skiRental.getNameOfPeopleWithBiggestFoot());
    }
}