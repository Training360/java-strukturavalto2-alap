package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainer = trainers.get(0);
        for (Trainer t : trainers) {
            if (t.getAge() > trainer.getAge()) {
                trainer = t;
            }
        }
        return trainer;
    }
}
