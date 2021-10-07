package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private List<Person> registeredPersons = new ArrayList<>();

    public List<Person> getRegisteredPersons() {
        return registeredPersons;
    }

    public void addPerson(Person person) {
        registeredPersons.add(person);
    }
}
