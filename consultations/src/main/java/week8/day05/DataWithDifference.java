package week8.day05;

public class DataWithDifference {

    private String name;

    private int value1;

    private int value2;

    public DataWithDifference(String name, int value1, int value2) {
        this.name = name;
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getName() {
        return name;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getDifference() {
        return Math.abs(value1 - value2);
    }
}
