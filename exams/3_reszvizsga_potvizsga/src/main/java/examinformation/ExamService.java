package examinformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ExamService {

    private int theoryMax;
    private int practiceMax;

    private Map<String, ExamResult> results = new TreeMap<>();

    public void readFromFIle(Path path){
        try(BufferedReader br = Files.newBufferedReader(path)){
            String firstLie[] = br.readLine().split(" ");
            theoryMax = Integer.parseInt(firstLie[0]);
            practiceMax = Integer.parseInt(firstLie[1]);
            while(br.ready()){
                processLine(br.readLine());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file: "+path);
        }
    }


    public List<String> findPeopleFailed(){
        return results.entrySet().stream()
                .filter(e->e.getValue().getPractice()*2<practiceMax || e.getValue().getTheory()*2<theoryMax)
                .map(Map.Entry::getKey).toList();
    }

    public String findBestPerson(){
        return results.entrySet().stream()
                .filter(e->!findPeopleFailed().contains(e.getKey()))
                .max(Comparator.comparing(e->e.getValue().getSumOfPoints()))
                .orElseThrow(()->new IllegalStateException("Didn't find the best!")).getKey();
    }



    private void processLine(String line) {
        String[] temp = line.split(";");
        String[] points = temp[1].split(" ");
        results.put(temp[0],new ExamResult(Integer.parseInt(points[0]),Integer.parseInt(points[1])));
    }

    public int getTheoryMax() {
        return theoryMax;
    }

    public int getPracticeMax() {
        return practiceMax;
    }

    public Map<String, ExamResult> getResults() {
        return results;
    }
}
