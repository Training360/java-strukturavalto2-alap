package students;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String className;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }


    public double getAverageOfGrades(){
        return grades.stream().mapToInt(i->i.intValue()).average().orElseThrow(()->new IllegalStateException("List is empty!"));
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
