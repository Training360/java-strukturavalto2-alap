package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        Student firstStudent = new Student("Úttörő Lajos", 135);
        Student secondStudent = new Student("Kiss József", 122);
        Student thirdStudent = new Student("Molnár Irén", 144);
        Student fourthStudent = new Student("Álmos Árpád", 118);
        Student fifthStudent = new Student("Illyés Borbála", 138);
        Student sixthStudent = new Student("Órás Eleonóra", 160);
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fifthStudent);
        students.add(sixthStudent);

        System.out.println(students);

        Map<String, Integer> studentsOrder = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentsOrder.put(firstStudent.getName(), firstStudent.getHeight());
        studentsOrder.put(secondStudent.getName(), secondStudent.getHeight());
        studentsOrder.put(thirdStudent.getName(), thirdStudent.getHeight());
        studentsOrder.put(fourthStudent.getName(), fourthStudent.getHeight());
        studentsOrder.put(fifthStudent.getName(), fifthStudent.getHeight());
        studentsOrder.put(sixthStudent.getName(), sixthStudent.getHeight());

        System.out.println(studentsOrder);
    }
}
