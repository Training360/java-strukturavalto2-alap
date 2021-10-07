package algorithmsfilter;

import java.util.ArrayList;
import java.util.List;

public class Filters {

    public List<Trainer> filterByName(List<Trainer> trainers, String part) {
        List<Trainer> filteredTrainers = new ArrayList<>();
        for (Trainer trainer: trainers) {
            if (trainer.getName().contains(part)) {
                filteredTrainers.add(trainer);
            }
        }
        return filteredTrainers;
    }
}