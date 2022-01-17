package lambdaintro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsedCarsTest {

    UsedCars usedCars;

    @BeforeEach
    void init() {
        List<Car> cars = Arrays.asList(
                new Car("Ford", "S-Max", 2_400_000, 5.11),
                new Car("Opel", "Astra", 2_100_000, 4.33),
                new Car("Fiat", "Scudo", 3_000_000, 5.27),
                new Car("Opel", "Zafira", 2_500_000, 5.10),
                new Car("Fiat", "Punto", 1_500_000, 3.56)
        );
        usedCars = new UsedCars(cars);
    }

    @Test
    void testListCarsByPrice() {
        List<Car> expected = usedCars.listCarsByPrice();

        assertEquals("Fiat", expected.get(0).getBrand());
        assertEquals(3_000_000, expected.get(4).getPrice());
    }

    @Test
    void testListCarsByLengthDesc() {
        List<Car> expected = usedCars.listCarsByLengthDesc();

        assertEquals("Ford", expected.get(1).getBrand());
        assertEquals(4.33, expected.get(3).getLength());
    }

    @Test
    void testListCarsOneBrandByType() {
        List<Car> expected = usedCars.listCarsOneBrandByType("Fiat");

        assertEquals(2, expected.size());
        assertEquals("Scudo", expected.get(1).getType());
    }
}