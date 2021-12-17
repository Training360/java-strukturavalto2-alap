package railwaystation;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {

    private static final int MAX_NUMBER_OF_TRAINS = 10;

    private List<Train> trains = new ArrayList<>();

    public List<Train> getTrains() {
        return new ArrayList<>(trains);
    }

    public void addTrain(Train train) {
        if (trains.size() < MAX_NUMBER_OF_TRAINS) {
            trains.add(train);
        } else {
            throw new IllegalArgumentException("Too much trains!");
        }
    }

    public Train getLongestTrain() {
        if (trains.size() == 0) {
            throw new IllegalArgumentException("No trains in the station.");
        }
        Train result = trains.get(0);
        for (Train t : trains) {
            if (t.getTotalLength() > result.getTotalLength()) {
                result = t;
            }
        }
        return result;
    }

    public int getHowManyTrainsHaveName() {
        int count = 0;
        for (Train t : trains) {
            if (t.getName() != null) {
                count++;
            }
        }
        return count;
    }

    public List<Train> getTrainsWithPassengersMoreThan(int number) {
        List<Train> result = new ArrayList<>();
        for (Train t : trains) {
            if (t.calculateTravellingPeople() > number) {
                result.add(t);
            }
        }
        return result;
    }
}
