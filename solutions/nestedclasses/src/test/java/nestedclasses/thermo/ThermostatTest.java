package nestedclasses.thermo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThermostatTest {

    @Test
    void testAddThermometer() {
        Thermostat thermostat = new Thermostat();
        thermostat.addThermometer(new Thermometer("room1", 25));
        thermostat.addThermometer(new Thermometer("room2", 20));
        thermostat.addThermometer(new Thermometer("room3", 22));

        assertEquals(Arrays.asList("room2", "room3"), thermostat.getRoomsToHeat());
    }

    @Test
    void testThermometerSetTemperatureShouldSetRoomsToHeat() {
        Thermostat thermostat = new Thermostat();
        Thermometer thermometer = new Thermometer("room1", 25);
        thermostat.addThermometer(thermometer);

        thermometer.setTemperature(22);
        assertEquals(Arrays.asList("room1"), thermostat.getRoomsToHeat());

        thermometer.setTemperature(23);
        assertEquals(new ArrayList<>(), thermostat.getRoomsToHeat());
    }
}