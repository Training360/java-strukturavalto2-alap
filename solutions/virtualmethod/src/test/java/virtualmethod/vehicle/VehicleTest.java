package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {

    @Test
    void testGetGrossLoad() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(1000 + Vehicle.PERSON_AVERAGE_WEIGHT, vehicle.getGrossLoad());
    }

    @Test
    void testGetVehicleWeight() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(1000, vehicle.getVehicleWeight());
    }

    @Test
    void testToString() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals("Vehicle{vehicleWeight=" + 1000 + '}', vehicle.toString());
    }
}