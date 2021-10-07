package introexceptionthrowjunit4;

public class Employee {

    private String name;

    public Employee(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name can not be empty!");
        }
        this.name = name;
    }
}
