package railwaystation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTrainTest {

    @Test
    void testCreateWithoutName() {
        PassengerTrain passengerTrain = new PassengerTrain(5);

        assertNull(passengerTrain.getName());
        assertEquals(5, passengerTrain.getNumberOfWagons());
        assertEquals(75, passengerTrain.getTotalLength());
        assertFalse(passengerTrain.hasDiningCar());
        assertEquals(350, passengerTrain.calculateTravellingPeople());
    }

    @Test
    void testCreateWithName() {
        PassengerTrain passengerTrain = new PassengerTrain("Erkel Ferenc Intercity", 5);

        assertEquals("Erkel Ferenc Intercity", passengerTrain.getName());
        assertEquals(5, passengerTrain.getNumberOfWagons());
        assertEquals(75, passengerTrain.getTotalLength());
        assertTrue(passengerTrain.hasDiningCar());
        assertEquals(280, passengerTrain.calculateTravellingPeople());
    }
}