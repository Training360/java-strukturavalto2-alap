package university;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        String studentNeptunCode = student.getNeptunCode();
        String anotherStudentNeptunCode = student.getNeptunCode();
        String studentEducationalId = student.getEducationalId();
        String anotherStudentEducationalId = anotherStudent.getEducationalId();

        return studentNeptunCode.equals(anotherStudentNeptunCode)
                && studentEducationalId.equals(anotherStudentEducationalId);
    }
}
