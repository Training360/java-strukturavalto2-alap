package dynamictypes;

public class DynamicTypesMain {

    public static void main(String[] args) {
//        Trainer trainer = new Trainer("John Doe");
//        Human human = new Trainer("John Doe");

//        Trainer trainer = new Trainer("John Doe");
//        Human human = trainer;

        Human human = new Human("John Doe");
        human = new Trainer("Jack Doe");
    }
}
