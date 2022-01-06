package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private List<Thermometer> thermometers;

    private List<String> roomsToHeat;

    private int temperatureLimit;

    public Thermostat() {
        thermometers = new ArrayList<>();
        roomsToHeat = new ArrayList<>();
        temperatureLimit = 23;
    }

    public void addThermometer(Thermometer thermometer) {
        thermometers.add(thermometer);
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp < temperatureLimit) {
                    roomsToHeat.add(room);
                } else {
                    roomsToHeat.remove(room);
                }
            }
        });
    }

    public List<String> getRoomsToHeat() {
        return this.roomsToHeat;
    }
}
