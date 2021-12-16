package railwaystation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTrainTest {

    @Test
    void testCreateWithOneTravellingPeople() {
        CargoTrain cargoTrain = new CargoTrain(5);

        assertNull(cargoTrain.getName());
        assertEquals(5, cargoTrain.getNumberOfWagons());
        assertEquals(75, cargoTrain.getTotalLength());
        assertEquals(1, cargoTrain.calculateTravellingPeople());
    }

    @Test
    void testCreateWithMoreTravellingPeople() {
        CargoTrain cargoTrain = new CargoTrain(43);

        assertNull(cargoTrain.getName());
        assertEquals(43, cargoTrain.getNumberOfWagons());
        assertEquals(645, cargoTrain.getTotalLength());
        assertEquals(4, cargoTrain.calculateTravellingPeople());
    }
}