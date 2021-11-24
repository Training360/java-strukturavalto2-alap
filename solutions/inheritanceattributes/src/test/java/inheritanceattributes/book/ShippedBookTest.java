package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShippedBookTest {

    @Test
    void testToString() {
        //Given
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals("Gyűrűk ura: 3000 Ft, postaköltség: 1200 Ft", book.toString());
    }

    @Test
    void testOrder() {
        //Given
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals(7200, book.order(2));
    }

    @Test
    void testPurchase() {
        //Given
        ShippedBook book = new ShippedBook("Gyűrűk ura", 3000, 1200);
        //Then
        assertEquals(6000, book.purchase(2));
    }
}