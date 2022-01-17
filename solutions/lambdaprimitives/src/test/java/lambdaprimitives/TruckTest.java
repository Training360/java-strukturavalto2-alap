package lambdaprimitives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    Truck truck;

    @BeforeEach
    void init() {
        List<Cargo> thingsToLoad = Arrays.asList(
                new Cargo("étkezőgarnitúra", 50, 2.70),
                new Cargo("10 db gipszkarton lap", 100, 1.80),
                new Cargo("zongora", 300, 1.40),
                new Cargo("fűnyíró", 15, 1.20),
                new Cargo("5000 db papírpohár", 30, 0.80)
        );
        truck = new Truck(thingsToLoad);
    }

    @Test
    void testGetShortestLength() {
        assertEquals(0.80, truck.getShortestLength());
    }

    @Test
    void testGetShortestLengthEmptyList() {
        truck = new Truck(new ArrayList<>());

        assertEquals(0.0, truck.getShortestLength());
    }

    @Test
    void testGetTotalWeight() {
        assertEquals(495, truck.getTotalWeight());
    }

    @Test
    void testGetTotalWeightEmptyList() {
        truck = new Truck(new ArrayList<>());

        assertEquals(0, truck.getTotalWeight());
    }

    @Test
    void testGetAverageWeight() {
        assertEquals(99, truck.getAverageWeight());
    }

    @Test
    void testGetAverageWeightEmptyList() {
        truck = new Truck(new ArrayList<>());

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> truck.getAverageWeight());
        assertEquals("No cargo.", ex.getMessage());
    }

    @Test
    void testGetMaxWeight() {
        assertEquals(300, truck.getMaxWeight());
    }

    @Test
    void testGetMaxWeightEmptyList() {
        truck = new Truck(new ArrayList<>());

        assertEquals(0, truck.getMaxWeight());
    }

    @Test
    void testGetWeightStatistics() {
        assertEquals("A rakományban található 5 tétel, melyeknek összsúlya 495 kg, közülük a " +
                "legnehezebb 300 kg, a legkönnyebb 15 kg. A súlyuk átlagosan 99,0 kg.", truck.getWeightStatistics());
    }

    @Test
    void testGetWeightStatisticsEmptyList() {
        truck = new Truck(new ArrayList<>());

        assertEquals("No cargo.", truck.getWeightStatistics());
    }
}