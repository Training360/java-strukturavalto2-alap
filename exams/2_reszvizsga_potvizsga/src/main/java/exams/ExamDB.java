package exams;

import java.util.ArrayList;
import java.util.List;

public class ExamDB {

    private List<Exam> exams = new ArrayList<>();

    public void addExam(Exam exam, int actualPoints){
        exam.calculateExamResult(actualPoints);
        exams.add(exam);
    }


    public List<Exam> getExams() {
        return new ArrayList<>(exams);
    }


    public int countPassedExams(){
        int count = 0;
        for(Exam actual : exams){
            if(actual.getExamResult()!=ExamResult.NOT_PASSED){
                count++;
            }
        }
        return count;
    }


    public List<Exam> findById(long studentId){
        List<Exam> result = new ArrayList<>();
        for(Exam actual : exams){
            if(actual.getStudentId()==studentId){
                result.add(actual);
            }
        }
        return result;
    }

    public List<String> findTopicByPrefix(String prefix){
        List<String> result = new ArrayList<>();

        for(Exam actual : exams){
            if(actual.getTopic().startsWith(prefix) && !result.contains(actual.getTopic())){
                result.add(actual.getTopic());
            }
        }
        return result;
    }
}
