package cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car("Toyota",1.2,Color.BLUE,120);

    @Test
    void createCarTest(){

        Car car = new Car("Toyota",1.2,Color.BLUE,120);

        assertEquals("Toyota",car.getBrand());
        assertEquals(1.2,car.getEngineSize());
        assertEquals(Color.BLUE,car.getColor());
        assertEquals(120,car.getPrice());

    }

    @Test
    void decreasePriceTest(){

        car.decreasePrice(1);
        assertEquals(118,car.getPrice());

        car.decreasePrice(99);
        assertEquals(1,car.getPrice());

    }

    @Test
    void decreasePriceWithWrongPercentTest(){

        car.decreasePrice(0);
        assertEquals(120,car.getPrice());

        car.decreasePrice(100);
        assertEquals(120,car.getPrice());
    }

}