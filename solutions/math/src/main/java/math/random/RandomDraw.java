package math.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        persons.add("Kiss József");
        persons.add("Nagy Béla");
        persons.add("Németh Géza");
        persons.add("Szép Virág");
        persons.add("Szabó Norbert");
        persons.add("Bíbor Hajnalka");
        persons.add("Dávid László");
        persons.add("Gyárfás Dezső");
        persons.add("Céhes Dóra");
        persons.add("Gémes Máté");

        Random random = new Random();
        int firstIndex = random.nextInt(5);
        int secondIndex = random.nextInt(5) + 5;

        System.out.println(persons.get(firstIndex));
        System.out.println(persons.get(secondIndex));
    }
}
