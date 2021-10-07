package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalespersonTest {

    @Test
    void testCreateSalesperson() {
        Salesperson salesperson = new Salesperson("Jack", 1500);
        assertEquals("Jack", salesperson.getName());
        assertEquals(1500, salesperson.getAmount());
    }
}
