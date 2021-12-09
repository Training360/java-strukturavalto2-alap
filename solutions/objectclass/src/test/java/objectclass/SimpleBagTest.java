package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    @Test
    void testCreate() {
        //Given
        SimpleBag bag = new SimpleBag();
        //Then
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.size());
    }


    @Test
    void testPut() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem("alma");
        bag.putItem(12);
        bag.putItem(new Book("Rejtő Jenő", "Az elveszett cirkáló"));
        bag.putItem(new Beer("Borsodi", 239));
        //Then
        assertFalse(bag.isEmpty());
        assertEquals(4, bag.size());

    }

    @Test
    void testIteration() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem(new Beer("Heineken", 250));
        bag.putItem(new Book("Rejtő Jenő", "Az elveszett cirkáló"));
        bag.putItem(new Beer("Borsodi", 239));
        while (bag.hasNext()) {
            bag.next();
        }
        //Then
        assertEquals(2, bag.getCursor());
    }

    @Test
    void testContains() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        Beer beer = new Beer("Borsodi", 239);
        Book book = new Book("Rejtő Jenő", "Az elveszett cirkáló");
        bag.putItem(beer);
        bag.putItem(book);
        //Then
        assertTrue(bag.contains(beer));
        assertTrue(bag.contains(book));
        assertFalse(bag.contains(new Book("Rejtő Jenő", "A megkerült cirkáló")));
    }
}