package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApartmentRentalTest {


    ApartmentRental apartmentRental;

    @BeforeEach
    void init(){
        apartmentRental = new ApartmentRental();

        apartmentRental.addApartment(new Apartment("Paris",54,BathRoomType.ONE_PER_ROOM, List.of("WIFI","Play Station")));
        apartmentRental.addApartment(new Apartment("Paris",62,BathRoomType.ONE_FOR_CORRIDOR, List.of("WIFI","Play Station","Bathtub")));
        apartmentRental.addApartment(new Apartment("Stockholm",44,BathRoomType.ONE_PER_ROOM, List.of("WIFI")));
        apartmentRental.addApartment(new Apartment("London",70,BathRoomType.ONE_PER_ROOM, List.of("WIFI","XBox")));
    }


    @Test
    void testFindApartmentByLocation(){
        List<Apartment> result = apartmentRental.findApartmentByLocation("Stockholm");

        assertEquals(1, result.size());
        assertEquals(44, result.get(0).getSize());
        assertEquals(List.of("WIFI"), result.get(0).getExtras());

        result = apartmentRental.findApartmentByLocation("Paris");

        assertEquals(2, result.size());
    }

    @Test
    void testFindApartmentByExtras(){
        List<Apartment> result = apartmentRental.findApartmentByExtras("WIFI");

        assertEquals(4,result.size());

        result = apartmentRental.findApartmentByExtras("WIFI","Bathtub");

        assertEquals(1, result.size());

        result = apartmentRental.findApartmentByExtras("WIFI","Play Station");

        assertEquals(2, result.size());
    }

    @Test
    void testApartmentWithBathroomType(){
        assertTrue(apartmentRental.isThereApartmentWithBathroomType(BathRoomType.ONE_PER_ROOM));
        assertFalse(apartmentRental.isThereApartmentWithBathroomType(BathRoomType.ONE_FOR_TWO_ROOMS));
    }

    @Test
    void testFindApartmentsSize(){
        assertEquals(List.of(54,62,44,70),apartmentRental.findApartmentsSize());
    }

}