package vehiclerental;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RentServiceTest {


    RentService rentService;
    User user1 = new User("jack", "jack@email.com", 10000);
    User user2 = new User("john", "john@email.com", 10000);
    Rentable car = new Car("Abc-143", 45);
    Rentable bike = new Bike("A143");

    @BeforeEach
    void init() {
        rentService = new RentService();

        rentService.registerUser(user1);
        rentService.registerUser(user2);
        rentService.registerUser(new User("johnDoe", "johndoe@email.com", 8100));
        rentService.registerUser(new User("janeDoe", "johndoe@email.com", 12000));


        rentService.addRentable(car);
        rentService.addRentable(bike);
        rentService.addRentable(new Car("ABC-123", 45));
        rentService.addRentable(new Car("ABC-122", 35));
        rentService.addRentable(new Bike("AB123"));
        rentService.addRentable(new Bike("BB123"));
    }

    @Test
    void registerUserTest() {
        rentService.registerUser(new User("jackDoe", "johndoe@email.com", 10000));

        assertEquals(5, rentService.getUsers().size());
    }


    @Test
    void registerUserWithWrongUserNameTest() {
        UserNameIsAlreadyTakenException uniae =
                assertThrows(UserNameIsAlreadyTakenException.class, () -> rentService.registerUser(new User("johnDoe", "johndoe@email.com", 10000)));

        assertEquals("Username is taken!", uniae.getMessage());
    }

    @Test
    void addNewRentable() {
        Rentable car = new Car("Abd-123", 67);
        rentService.addRentable(car);
        assertEquals(7, rentService.getRentables().size());
    }

    @Test
    void testRentableIsSet() {
        Rentable car = new Car("Abd-123", 67);
        rentService.addRentable(car);
        rentService.addRentable(car);
        assertEquals(7, rentService.getRentables().size());
    }

    @Test
    void rentTest() {
        rentService.rent(user1, car, LocalTime.of(13, 12));

        assertTrue(rentService.getActualRenting().containsKey(car));
        assertEquals("jack", rentService.getActualRenting().get(car).getUserName());
        assertEquals(LocalTime.of(13,12),car.getRentingTime());
        assertEquals(1, rentService.getActualRenting().keySet().size());
    }

    @Test
    void rentRentableTwiceTest(){
        rentService.rent(user1, car, LocalTime.of(13, 12));
        assertThrows(IllegalStateException.class,()->rentService.rent(user2, car, LocalTime.of(13, 16)));
    }

    @Test
    void rentWithLowBalanceTest(){
         user1 = new User("jack", "jack@email.com", 8099);
         assertThrows(IllegalStateException.class,()->rentService.rent(user1, car, LocalTime.of(13, 16)));
    }

    @Test
    void testActualRentingInOrder(){

        rentService.rent(user1, car, LocalTime.of(13, 12));
        rentService.rent(user2, bike, LocalTime.of(13, 10));


        assertEquals(List.of(bike,car), new ArrayList<>(rentService.getActualRenting().keySet()));
    }

    @Test
    void closeRentTest(){
        rentService.rent(user1, car, LocalTime.of(13, 12));
        rentService.rent(user2, bike, LocalTime.of(13, 10));

        rentService.closeRent(car,30);

        assertEquals(List.of(bike),new ArrayList<>(rentService.getActualRenting().keySet()));
        assertEquals(user1.getBalance(),8650);
        assertNull(car.getRentingTime());
    }


}