package numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RisingNumbers {

    public int getNumberOfSixDigitRisingNumbers(List<Integer> numbers) {
        if (isInvalidList(numbers)) {
            throw new IllegalArgumentException("There are no numbers!");
        }
        int count = 0;
        for (int i : numbers) {
            if (hasSixDigits(i) && isRisingNumber(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean hasSixDigits(int number) {
        return number >= 100_000 && number <= 999_999;
    }

    private boolean isRisingNumber(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }
        return areDigitsDifferent(digits) && areDigitsRising(digits);
    }

    private boolean areDigitsDifferent(List<Integer> digits) {
        return digits.size() == new HashSet<>(digits).size();
    }

    private boolean areDigitsRising(List<Integer> digits) {
        List<Integer> expected = new ArrayList<>(digits);
        Collections.sort(expected);
        Collections.reverse(expected);
        return digits.equals(expected);
    }

    private boolean isInvalidList(List<Integer> numbers) {
        return numbers == null || numbers.isEmpty();
    }
}
