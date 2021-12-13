package city;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void createAddress() {
        Address address = new Address("Kossuth", 6);

        assertEquals("Kossuth", address.getStreet());
        assertEquals(6, address.getBuildingNumber());
    }
}