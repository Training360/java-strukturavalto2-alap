package week14.day04;

import java.util.List;

public class HumanService {

    private List<String> names = List.of("John","Jack","Jane");

    public List<Human> createHumans(){
        return names.stream()
                .map(Human::new)
                .toList();
    }
}
