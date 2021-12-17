package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {

    @Test
    void testCreate() {
        Food food = new Food("tejföl", LocalDate.of(2021, 12, 9));

        assertEquals("tejföl", food.getName());
        assertEquals(LocalDate.of(2021, 12, 9), food.getExpirationDate());
    }
}
