package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String ssn;

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Person person = (Person) other;
        return Objects.equals(this.ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }

    public static void main(String[] args) {
        Person person = new Person("Kiss József", 45, "111111110");
        Person anotherPerson = new Person("Nagy Béla", 32, "111111110");

        System.out.println(person.equals(anotherPerson));
        System.out.println(anotherPerson.equals(person));

        System.out.println(person.hashCode());
        System.out.println(anotherPerson.hashCode());
    }
}
