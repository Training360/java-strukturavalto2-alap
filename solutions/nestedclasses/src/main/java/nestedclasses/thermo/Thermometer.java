package nestedclasses.thermo;

public class Thermometer {

    private String roomName;

    private int temperature;

    private ThermometerObserver observer;

    public Thermometer(String roomName, int temperature) {
        this.roomName = roomName;
        this.temperature = temperature;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getTemperature() {
        return temperature;
    }

    public ThermometerObserver getObserver() {
        return observer;
    }

    public void onTemperatureChanged() {
        if (observer != null) {
            observer.handleTemperatureChange(temperature, roomName);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChanged();
    }
}
