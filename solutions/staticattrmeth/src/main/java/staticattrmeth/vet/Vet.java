package staticattrmeth.vet;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Dog> dogs = new ArrayList<>();
    private static long code = 1;

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dog.setCodeNumber(code);
        dogs.add(dog);
        code++;
    }
}
