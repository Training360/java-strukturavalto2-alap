package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {


    public List<String> words = new ArrayList<>();

    public void addWords(String s, String... more){
        words.add(s);
        words.addAll(Arrays.asList(more));
    }

    public List<String> getWords() {
        return words;
    }


    public List<String> findWordsOccursOnes(){
        List<String> result = new ArrayList<>();
        for(String actual : words){
            if(words.indexOf(actual)==words.lastIndexOf(actual)){
                result.add(actual);
            }
        }
        return result;
    }

}
