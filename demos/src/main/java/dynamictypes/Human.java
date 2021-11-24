package dynamictypes;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Human: " + name;
    }

    public String getName() {
        return name;
    }
}
