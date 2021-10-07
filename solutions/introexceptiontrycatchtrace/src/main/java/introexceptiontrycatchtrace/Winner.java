package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> people = new ArrayList<>(Arrays.asList("Kiss József", "Nagy Béla", null, "Szép Virág"));

    public List<String> getPeople() {
        return people;
    }

    public void addPerson(String name) {
        people.add(name);
    }

    public String getWinner() {
        Random random = new Random();
        int index = random.nextInt(people.size());
        String winner = people.get(index);
        return winner.toUpperCase();
    }
}
