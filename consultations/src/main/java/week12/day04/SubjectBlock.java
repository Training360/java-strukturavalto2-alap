package week12.day04;

public class SubjectBlock {

    private String name;
    private String subject;
    private String gradeAndClass;
    private int lessonNumber;

    public SubjectBlock(String name, String subject, String gradeAndClass, int lessonNumber) {
        this.name = name;
        this.subject = subject;
        this.gradeAndClass = gradeAndClass;
        this.lessonNumber = lessonNumber;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getGradeAndClass() {
        return gradeAndClass;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectBlock that = (SubjectBlock) o;

        if (lessonNumber != that.lessonNumber) return false;
        if (!name.equals(that.name)) return false;
        if (!subject.equals(that.subject)) return false;
        return gradeAndClass.equals(that.gradeAndClass);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + subject.hashCode();
        result = 31 * result + gradeAndClass.hashCode();
        result = 31 * result + lessonNumber;
        return result;
    }

    @Override
    public String toString() {
        return "SubjectBlock{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", gradeAndClass='" + gradeAndClass + '\'' +
                ", lessonNumber=" + lessonNumber +
                '}';
    }
}
