package arrayofarrays;

public class Rectangle {

    public void rectangularMatrix(int size) {
        int[][] rectangularMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rectangularMatrix[i][j] = i;
                System.out.print(rectangularMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.rectangularMatrix(6);
    }
}
