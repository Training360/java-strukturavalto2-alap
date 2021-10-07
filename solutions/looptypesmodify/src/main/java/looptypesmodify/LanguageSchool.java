package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student firstStudent = new Student("Kiss József");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Szép Virág");
        Student fourthStudent = new Student("Szabó Dezső");
        Student fifthStudent = new Student("Varga Nóra");
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);

        System.out.println(students.size());

        secondStudent.setActive(false);
        fourthStudent.setActive(false);

        List<Student> studentsToRemove = new ArrayList<>();
        for (Student s : students) {
            if (!s.isActive()) {
                studentsToRemove.add(s);
            }
        }
        students.removeAll(studentsToRemove);

        System.out.println(students.size());
    }
}
