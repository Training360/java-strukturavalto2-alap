package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int degrees = 0;
        int count = 0;
        for (int i = 10; degrees < 360; i += 10) {
            degrees += i;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HeadingNorth north = new HeadingNorth();

        System.out.println(north.getNumberOfNewDirections());
    }
}
