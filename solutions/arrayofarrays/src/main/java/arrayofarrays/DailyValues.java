package arrayofarrays;

public class DailyValues {

    public void getValues() {
        int[][] values = new int[12][];
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < numberOfDays.length; i++) {
            values[i] = new int[numberOfDays[i]];
        }
        printArrayOfArrays(values);
    }

    private void printArrayOfArrays(int[][] values) {
        for (int i[] : values) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();

        dailyValues.getValues();
    }
}
