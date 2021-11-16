package cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("BestCars",100);

    @BeforeEach
    void init(){
        carShop.addCar(new Car("Toyota",1.2,Color.BLUE,80));
        carShop.addCar(new Car("Toyota",1.2,Color.BLUE,70));
        carShop.addCar(new Car("Suzuki",1.2,Color.BLUE,30));
    }

    @Test
    void createCarShopTest(){
        CarShop carShop = new CarShop("BestCars",100);

        assertEquals("BestCars",carShop.getName());
        assertEquals(100,carShop.getMaxPrice());
        assertEquals(0,carShop.getCarsForSell().size());

    }

    @Test
    void addCarWithValidPriceTest(){

         boolean result = carShop.addCar(new Car("Toyota",1.2,Color.BLUE,99));

         assertTrue(result);
         assertEquals(4,carShop.getCarsForSell().size());
         assertEquals("Toyota",carShop.getCarsForSell().get(0).getBrand());

    }

    @Test
    void addCarWithInvalidPriceTest(){
        boolean result = carShop.addCar(new Car("Toyota",1.2,Color.BLUE,101));

        assertFalse(result);
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void sumPriceOfCarsTest(){

        assertEquals(180, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThan(){

    }


}