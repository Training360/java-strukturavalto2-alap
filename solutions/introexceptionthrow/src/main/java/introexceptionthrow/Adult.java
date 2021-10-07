package introexceptionthrow;

public class Adult {

    private String name;
    private int age;

    public Adult(String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException(name + " is too young!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
