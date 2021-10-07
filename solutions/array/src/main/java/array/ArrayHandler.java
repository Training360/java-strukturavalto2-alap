package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + ". "  + source[i];
        }
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();

        int[] numbers = new int[]{1, 3, 5, 10};
        String[] words = new String[]{"egy", "kettő", "három"};

        arrayHandler.addIndexToNumber(numbers);

        for (int i : numbers) {
            System.out.println(i);
        }

        for (int i : numbers) {
            System.out.print(i + ", ");
        }

        System.out.println();

        arrayHandler.concatenateIndexToWord(words);

        for (String s : words) {
            System.out.println(s);
        }

        for (String s : words) {
            System.out.print(s + ", ");
        }
    }
}
