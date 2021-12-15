package exams;

public abstract class Exam {


    private long studentId;
    private String topic;
    private int maxPoints;
    private ExamResult examResult;


    public Exam(long studentId,String topic, int maxPoints) {
        this.studentId = studentId;
        this.topic = topic;
        this.maxPoints = maxPoints;
    }


    public Exam(long studentId,String topic) {
       this(studentId,topic,100);
    }


    public abstract void calculateExamResult(int actualPoints);

    public long getStudentId() {
        return studentId;
    }

    public String getTopic() {
        return topic;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public ExamResult getExamResult() {
        return examResult;
    }

    public void setExamResult(ExamResult examResult) {
        this.examResult = examResult;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }


}
