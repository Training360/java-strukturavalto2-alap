package collectionscomp;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student one, Student other) {
        return Integer.valueOf(one.getHeight()).compareTo(other.getHeight());
    }
}
