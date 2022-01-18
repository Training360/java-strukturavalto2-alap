package week13.day01;

import java.util.*;

public class ClassNotebook {

    private Map<Student, List<Integer>> notebook = new TreeMap<>();


    public void addStudent(Student student) {
        notebook.put(student, new ArrayList<>());
    }

    public void addMark(int id, int mark){
        for(Map.Entry<Student,List<Integer>> actual : notebook.entrySet()){
            if(actual.getKey().getId()==id){
                actual.getValue().add(mark);
            }
        }
    }

    public Map<Student, List<Integer>> getNotebook() {
        return notebook;
    }
}
