package vehiclerental;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CarTest  {

    Rentable car;

    @BeforeEach
    void init(){
        car = new Car("ABC-123",45);
    }

    @Test
    void createBike(){
        assertNull(car.getRentingTime());
    }

    @Test
    void rentTest(){
        car.rent(LocalTime.now());
        assertEquals(LocalTime.now().getHour(),car.getRentingTime().getHour());
        assertEquals(LocalTime.now().getMinute(),car.getRentingTime().getMinute());
    }

    @Test
    void closeRentTest(){
        car.rent(LocalTime.now());
        car.closeRent();
        assertNull(car.getRentingTime());
    }

    @Test
    void calculateSumPriceTest(){
        long result = car.calculateSumPrice(60);

        assertEquals(2700, result );
        result = car.calculateSumPrice(30);
        assertEquals(1350, result);
    }

    @Test
    void compareToTest(){
        Rentable other = new Bike("B123");
        car.rent(LocalTime.of(13,12));
        other.rent(LocalTime.of(12,11));
        assertEquals(1,car.compareTo(other));
    }


}