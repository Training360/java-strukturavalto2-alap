package students;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeacherNotebook {


    private List<Student> students = new ArrayList<>();


    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine())!=null){
                Student s = processLine(line);
                students.add(s);
            }

        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot open file!");
        }
    }

    private Student processLine(String line) {
        String[] temp = line.split(";");
        Student actual = new Student(temp [0],temp[1]);

        for(int i=2;i<temp.length;i++){
            actual.addGrade(Integer.parseInt(temp[i]));
        }
        return actual;
    }


    public List<String> findFailingStudents(){
        return students.stream().filter(s->s.getAverageOfGrades()<2.0)
                .map(Student::getName).toList();
    }

    public List<Student> getStudents() {
        return students;
    }
}
