package collectionsclass;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult> {

    private String nameOfPerson;

    private int points;

    public ExamResult(String nameOfPerson, int points) {
        this.nameOfPerson = nameOfPerson;
        this.points = points;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return points == that.points && Objects.equals(nameOfPerson, that.nameOfPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPerson, points);
    }

    @Override
    public int compareTo(ExamResult other) {
        return Integer.valueOf(points).compareTo(other.points);
    }
}
