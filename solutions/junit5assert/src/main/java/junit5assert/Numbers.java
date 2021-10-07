package junit5assert;

public class Numbers {

    public int[] getEvenNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            }
        }
        return numbers;
    }
}
