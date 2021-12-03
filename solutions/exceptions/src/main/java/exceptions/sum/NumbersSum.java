package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter should not be null!");
        }
        return sum(numbers);
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter should not be null!");
        }
        int[] converted;
        try {
            converted = convertNumbers(numbers);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Illegal numbers!");
        }
        return sum(converted);
    }

    private int[] convertNumbers(String[] numbers) {
        int[] converted = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            converted[i] = Integer.parseInt(numbers[i]);
        }
        return converted;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
