package examinformation;

public class ExamResult implements Comparable<ExamResult>{

    private int theory;
    private int practice;

    public ExamResult(int theory, int practice) {
        this.theory = theory;
        this.practice = practice;
    }

    public int getTheory() {
        return theory;
    }

    public int getPractice() {
        return practice;
    }

    public int getSumOfPoints() {
        return theory + practice;
    }


    @Override
    public int compareTo(ExamResult o) {
       return Integer.compare(o.getSumOfPoints(),this.getSumOfPoints());
    }
}
