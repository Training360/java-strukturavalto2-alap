package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return new ArrayList<>(words);
    }

    public void addWord(String word) {
        validateWord(word);
        words.add(word);
    }

//    public boolean isThereAWordTwice() {
//        for (int i = 0; i < words.size(); i++) {
//            if (checkWord(i)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private boolean checkWord(int i) {
//        for (int j = i + 1; j < words.size(); j++) {
//            if (words.get(i).equals(words.get(j))) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean isThereAWordTwice() {
        for (String word : words) {
            if (words.indexOf(word) != words.lastIndexOf(word)) {
                return true;
            }
        }
        return false;
    }

    private void validateWord(String word) {
        if (word.indexOf(" ") != -1) {
            throw new IllegalArgumentException("It should be one word!");
        }
        if (!word.toLowerCase().equals(word)) {
            throw new IllegalArgumentException("Word should be lower case!");
        }
    }
}
