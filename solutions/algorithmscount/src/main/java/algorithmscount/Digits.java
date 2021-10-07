package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            String numberString = Integer.toString(i);
            int firstDigit = Integer.parseInt(numberString.substring(0, 1));
            int secondDigit = Integer.parseInt(numberString.substring(1));

            if (firstDigit + 5 == secondDigit || firstDigit - 5 == secondDigit) {
                count++;
            }
        }
        return count;
    }
}
