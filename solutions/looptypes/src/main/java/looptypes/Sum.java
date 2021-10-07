package looptypes;

public class Sum {

    public void printSums(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int sum = numbers[i] + numbers[i + 1];
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = new int[]{2, 6, 3, 5, 7, 9};
        sum.printSums(numbers);
    }
}
