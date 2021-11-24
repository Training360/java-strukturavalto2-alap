package dynamictypes.school;

public class School {

    private String name;
    private int numberOfYears;

    public School(String name, int numberOfYears) {
        this.name = name;
        this.numberOfYears = numberOfYears;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }
}
