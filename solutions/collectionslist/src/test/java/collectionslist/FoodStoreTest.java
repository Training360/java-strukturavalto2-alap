package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    @Test
    void testSellFirst() {
        FoodStore foodStore = new FoodStore();
        foodStore.addFood(new Food("kenyér", LocalDate.now()));
        foodStore.addFood(new Food("tej", LocalDate.now().plusDays(4)));
        foodStore.addFood(new Food("tejföl", LocalDate.now().plusDays(2)));
        foodStore.sellFirst(new Food("felvágott", LocalDate.now()));

        assertEquals(4, foodStore.getFoods().size());
        assertEquals("felvágott", foodStore.getFoods().get(0).getName());
    }
}