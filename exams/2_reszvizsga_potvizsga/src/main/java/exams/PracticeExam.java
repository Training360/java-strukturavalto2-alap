package exams;

import java.util.List;

public class PracticeExam extends Exam {

    private List<Integer> points;

    public PracticeExam(long studentId, String topic, List<Integer> points) {
        super(studentId, topic);
        this.points = points;
        int maxPoints = calculateMaxPointsWithList();
        if (maxPoints < 10 || maxPoints > 150) {
            throw new IllegalArgumentException("Maximum points should be between 10 and 150! Actual:" + maxPoints);
        }
        setMaxPoints(calculateMaxPointsWithList());
    }

    private int calculateMaxPointsWithList() {
        int sum = 0;
        for (Integer i : points) {
            sum += i;
        }
        return sum;
    }

    @Override
    public void calculateExamResult(int actualPoints) {
        new ActualPointValidator().checkActualPoint(actualPoints, getMaxPoints());

        double percent = actualPoints / (getMaxPoints() / 100.0);
        if (percent < 51.0) {
            setExamResult(ExamResult.NOT_PASSED);
        } else if (percent < 76.0) {
            setExamResult(ExamResult.OK);
        } else {
            setExamResult(ExamResult.PERFECT);
        }
    }
}
