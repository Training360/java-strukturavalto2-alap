package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] testArray = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};

        arrayOfArrays.printArrayOfArrays(testArray);
    }
}
