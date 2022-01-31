package vehiclerental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {


    Rentable bike;

    @BeforeEach
    void init(){
        bike = new Bike("A123");
    }


    @Test
    void createBike(){
        assertNull(bike.getRentingTime());
    }

    @Test
    void rentTest(){
        bike.rent(LocalTime.now());
        assertEquals(LocalTime.now().getHour(),bike.getRentingTime().getHour());
        assertEquals(LocalTime.now().getMinute(),bike.getRentingTime().getMinute());
    }

    @Test
    void closeRentTest(){
        bike.rent(LocalTime.now());
        bike.closeRent();
        assertNull(bike.getRentingTime());
    }

    @Test
    void calculateSumPriceTest(){
        long result = bike.calculateSumPrice(60);

        assertEquals(900, result );
        result = bike.calculateSumPrice(30);
        assertEquals(450, result);
    }

    @Test
    void compareToTest(){
        Rentable other = new Bike("B123");
        bike.rent(LocalTime.of(13,12));
        other.rent(LocalTime.of(12,11));
        assertEquals(1,bike.compareTo(other));
    }
}