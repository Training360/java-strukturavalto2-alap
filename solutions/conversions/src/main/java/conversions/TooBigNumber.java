package conversions;

public class TooBigNumber {

    public long getRightResult(int number) {
        long result = 2_147_483_647;
        result += number;
        return result;
    }

    public static void main(String[] args) {
        TooBigNumber number = new TooBigNumber();
        System.out.println(number.getRightResult(1));
    }
}
