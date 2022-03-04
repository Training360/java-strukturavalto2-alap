package settlers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettlerTest {

    @Test
    void testCreate() {
        Settler settler = new Settler("John Doe", 65);

        assertEquals("John Doe", settler.getNameOfSettler());
        assertEquals(65, settler.getAmountOfTobacco());
        assertEquals(32_500, settler.getExpectedIncome());
    }
}