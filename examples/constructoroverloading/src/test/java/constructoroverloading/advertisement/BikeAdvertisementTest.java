package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void testCreateWithTwoParameters() {
        BikeAdvertisement advertisement = new BikeAdvertisement("Gyerekkori BMX", 5000);

        assertEquals("Gyerekkori BMX", advertisement.getDescription());
        assertEquals(5000, advertisement.getPrice());
        assertNull(advertisement.getBrand());
        assertNull(advertisement.getExtras());
        assertNull(advertisement.getSerialNumber());
    }

    @Test
    void testCreateWithThreeParameters() {
        BikeAdvertisement advertisement = new BikeAdvertisement("Női 26-os bicikli", 15000, "Csepel");

        assertEquals("Női 26-os bicikli", advertisement.getDescription());
        assertEquals(15000, advertisement.getPrice());
        assertEquals("Csepel", advertisement.getBrand());
        assertNull(advertisement.getExtras());
        assertNull(advertisement.getSerialNumber());
    }

    @Test
    void testCreateWithFourParameters() {
        BikeAdvertisement advertisement = new BikeAdvertisement("20-as gyerek mountain bike", 35000,
                "Decathlon", Arrays.asList("váltó", "sárhányó"));

        assertEquals("20-as gyerek mountain bike", advertisement.getDescription());
        assertEquals(35000, advertisement.getPrice());
        assertEquals("Decathlon", advertisement.getBrand());
        assertEquals("sárhányó", advertisement.getExtras().get(1));
        assertNull(advertisement.getSerialNumber());
    }

    @Test
    void testCreateWithFiveParameters() {
        BikeAdvertisement advertisement = new BikeAdvertisement("felnőtt férfi hegyi terepbicikli", 450000,
                "Cube", Arrays.asList("21 sebességes váltó", "még 3 hónap gyártói garancia", "defektjavító készlet"),
                "36482-565");

        assertEquals("felnőtt férfi hegyi terepbicikli", advertisement.getDescription());
        assertEquals(450000, advertisement.getPrice());
        assertEquals("Cube", advertisement.getBrand());
        assertEquals("defektjavító készlet", advertisement.getExtras().get(2));
        assertEquals("36482-565", advertisement.getSerialNumber());
    }
}