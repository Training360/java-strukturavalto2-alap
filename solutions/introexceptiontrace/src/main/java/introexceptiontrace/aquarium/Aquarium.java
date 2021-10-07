package introexceptiontrace.aquarium;

import java.util.List;

public class Aquarium {

    private List<Fish> ornamentalFish;

    public List<Fish> getOrnamentalFish() {
        return ornamentalFish;
    }

    public void addFish(Fish fish) {
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }
}
