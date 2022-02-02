package streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApartmentTest {


    @Test
    void createApartment(){
        Apartment apartment = new Apartment("Paris",54,BathRoomType.ONE_PER_ROOM, List.of("WIFI","Play Station"));

        assertEquals("Paris",apartment.getLocation());
        assertEquals(54, apartment.getSize());
        assertEquals(BathRoomType.ONE_PER_ROOM, apartment.getBathRoomType());
        assertEquals(List.of("WIFI","Play Station"), apartment.getExtras());
    }

}