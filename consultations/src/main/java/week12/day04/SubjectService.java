package week12.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    private List<SubjectBlock> subjectBlocks  = new ArrayList<>();

    public SubjectService() {
    }

    public SubjectService(List<SubjectBlock> subjectBlocks) {
        this.subjectBlocks = subjectBlocks;
    }

    public SubjectService(String fileName) {
        readFromFile(fileName);
    }

    private void readFromFile(String fileName){
        try(BufferedReader br = Files.newBufferedReader(Path.of(fileName))){
            String line;
            while((line=br.readLine())!=null){
                subjectBlocks.add(new SubjectBlock(line,br.readLine(),br.readLine(),Integer.parseInt(br.readLine())));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot reach file!",e);
        }
    }


    public boolean containsSubjectBlock(SubjectBlock subjectBlock){
        return subjectBlocks.contains(subjectBlock);
    }


    public int sumOfLessonNumberByName(String name){
        int sum = 0;
        for(SubjectBlock actual : subjectBlocks){
            if(name.equals(actual.getName())){
                sum+=actual.getLessonNumber();
            }
        }
        return sum;
    }

    public List<SubjectBlock> getSubjectBlocks() {
        return subjectBlocks;
    }
}
