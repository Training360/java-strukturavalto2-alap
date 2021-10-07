package controladvanced.labels;

public class Labels {

    public int[][] getTableOfNumbers(int number) {
        int[][] table = new int[number][number];
        table[0][0] = 1;
        OUTER: for (int i = 0; i < number; i++) {
            INNER: for (int j = 0; j < number; j++) {
                table[i][j] = (i + 1) + (j + 1);
            }
        }
        return table;
    }
}
