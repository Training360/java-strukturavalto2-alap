package lambda;

import java.util.List;

public class Remainder {

    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        numbers.replaceAll(number -> number % divisor);
        return numbers;
    }
}
