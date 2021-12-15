package exams;

public class ActualPointValidator {

    public boolean checkActualPoint(int actualPoint, int maxPoint){
        if(actualPoint<0 || actualPoint>maxPoint){
            throw new IllegalArgumentException("Actual point must be 0 and maxpoint!");
        }
        return true;
    }

}
