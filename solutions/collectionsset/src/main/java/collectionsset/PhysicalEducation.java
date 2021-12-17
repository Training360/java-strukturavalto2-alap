package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> orderInLessons = new TreeSet<>();
        for (Student student : students) {
            orderInLessons.add(student.getHeight());
        }
        return orderInLessons;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kiss József", 123));
        students.add(new Student("Nagy Béla", 135));
        students.add(new Student("Szép Virág", 122));
        students.add(new Student("Szabó Noémi", 132));
        students.add(new Student("Vörös Valéria", 130));

        PhysicalEducation physicalEducation = new PhysicalEducation();
        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
