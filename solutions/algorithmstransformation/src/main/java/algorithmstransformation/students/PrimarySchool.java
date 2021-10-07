package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private List<Person> persons;

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person p : persons) {
            if (p.getAge() >= 6 && p.getAge() <= 14) {
                Student student = new Student(p.getName(), p.getAddress());
                students.add(student);
            }
        }
        return students;
    }
}
