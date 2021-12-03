package polymorphism.river;

public abstract class River implements Water {

    private String name;
    private int length;

    public River(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}
