package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> numberOfPeople = Files.readAllLines(path);
            for (String s : numberOfPeople) {
                String[] temp = s.split(" ");
                int people = Integer.parseInt(temp[1]);
                int amountForOnePerson = amount / people;
                result.add(temp[0] + " " + amountForOnePerson);
            }
        } catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
            throw new IllegalStateException("Something went wrong while counting.", ex);
        }
        return result;
    }
}
