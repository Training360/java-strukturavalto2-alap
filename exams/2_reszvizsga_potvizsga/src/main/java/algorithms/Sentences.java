package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Sentences {

    public static final String ENDING_MARKS = "!?.";

    private List<String> sentences = new ArrayList<>();


    public void addSentence(String sentence){
        if(checkEndsWithMark(sentence) && checkStartsWithCapital(sentence)){
            sentences.add(sentence);
        }
    }


    public String findLongestSentence(){
        if(sentences.size()==0){
            throw new IllegalStateException("List is empty!");
        }
        String result = "";
        for(String act : sentences){
            if(act.length()>result.length()){
                result = act;
            }
        }
        return result;
    }

    public List<String> getSentences() {
        return sentences;
    }

    private boolean checkStartsWithCapital(String sentence){
        if(sentence.charAt(0)==sentence.toUpperCase().charAt(0)){
            return true;
        }
        throw new IllegalArgumentException("Sentence must start with capital!");
    }

    private boolean checkEndsWithMark(String sentence){
        if(ENDING_MARKS.contains(Character.toString(sentence.charAt(sentence.length()-1)))){
            return true;
        }
        throw new IllegalArgumentException("Sentence must end with ending mark!");
    }

}
