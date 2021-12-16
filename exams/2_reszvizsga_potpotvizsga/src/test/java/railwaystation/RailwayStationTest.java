package railwaystation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RailwayStationTest {

    RailwayStation railwayStation;

    @BeforeEach
    void init() {
        railwayStation = new RailwayStation();
        railwayStation.addTrain(new PassengerTrain("Lehár Ferenc Intercity", 8));
        railwayStation.addTrain(new CargoTrain(18));
        railwayStation.addTrain(new CargoTrain(35));
        railwayStation.addTrain(new PassengerTrain(9));
        railwayStation.addTrain(new PassengerTrain("Erkel Ferenc Intercity", 10));
        railwayStation.addTrain(new CargoTrain(21));
        railwayStation.addTrain(new PassengerTrain("Hortobágy", 6));
        railwayStation.addTrain(new PassengerTrain(4));
        railwayStation.addTrain(new CargoTrain(7));
    }

    @Test
    void testInit() {
        assertEquals(9, railwayStation.getTrains().size());
    }

    @Test
    void testAddTrain() {
        railwayStation.addTrain(new CargoTrain(5));

        assertEquals(10, railwayStation.getTrains().size());
    }

    @Test
    void testAddTrainTooMuchTrains() {
        railwayStation.addTrain(new CargoTrain(5));

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> railwayStation.addTrain(new CargoTrain(12)));
        assertEquals("Too much trains!", ex.getMessage());
    }

    @Test
    void testGetLongestTrain() {
        Train expected = railwayStation.getLongestTrain();

        assertNull(expected.getName());
        assertEquals(525, expected.getTotalLength());
        assertEquals(35, expected.getNumberOfWagons());
        assertEquals(15, Train.LENGTH_OF_WAGON);
    }

    @Test
    void testGetHowManyTrainsHaveName() {
        assertEquals(3, railwayStation.getHowManyTrainsHaveName());
    }

    @Test
    void testGetTrainsWithPassengersMoreThan() {
        List<Train> expected = railwayStation.getTrainsWithPassengersMoreThan(500);

        assertEquals(2, expected.size());
        assertNull(expected.get(0).getName());
        assertEquals(9, expected.get(0).getNumberOfWagons());
        assertEquals("Erkel Ferenc Intercity", expected.get(1).getName());
        assertEquals(10, expected.get(1).getNumberOfWagons());
    }
}