package dynamictypes;

public class Trainer extends Human {

    public Trainer(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Trainer: " + getName();
    }


}
