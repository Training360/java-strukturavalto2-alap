package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> vaccinationOrder = new PriorityQueue<>();
        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                vaccinationOrder.add(p.getAge());
            }
        }
        return vaccinationOrder;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kiss József", 76));
        people.add(new Person("Nagy Béla", 24));
        people.add(new Person("Szép Virág", 65));
        people.add(new Person("Pál Tamás", 12));
        people.add(new Person("Németh Gergely", 83));
        people.add(new Person("Szabó Fruzsina", 54));

        Vaccination vaccination = new Vaccination();
        Queue<Integer> vaccinationOrder = vaccination.getVaccinationOrder(people);

        System.out.println(vaccinationOrder);
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
    }
}
