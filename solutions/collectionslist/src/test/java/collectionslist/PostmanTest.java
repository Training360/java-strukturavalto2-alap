package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman postman;

    @BeforeEach
    void init() {
        postman = new Postman();
        postman.addAddress("Kossuth Lajos utca 2.");
        postman.addAddress("Fő utca 3.");
        postman.addAddress("Rákóczi utca 16.");
        postman.addAddress("Fő utca 3.");
        postman.addAddress("Fő utca 3.");
        postman.addAddress("Petőfi utca 33.");
    }

    @Test
    void testInit() {
        assertEquals(6, postman.getAddresses().size());
        assertEquals("Kossuth Lajos utca 2.", postman.getAddresses().get(0));
        assertEquals("Fő utca 3.", postman.getAddresses().get(1));
        assertEquals("Rákóczi utca 16.", postman.getAddresses().get(2));
    }

    @Test
    void testRemoveAddress() {
        postman.removeAddress("Fő utca 3.");

        assertEquals(5, postman.getAddresses().size());
        assertEquals("Kossuth Lajos utca 2.", postman.getAddresses().get(0));
        assertEquals("Rákóczi utca 16.", postman.getAddresses().get(1));
    }
}