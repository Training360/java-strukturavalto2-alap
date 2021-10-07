package junit5fixture;

public class Employee {

    private String name;

    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        System.out.println("Employee constructor");
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge(int year) {
        return year - yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
