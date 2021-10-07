package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String s : words) {
            if (!s.startsWith(prefix)) {
                wordsToRemove.add(s);
            }
        }
        words.removeAll(wordsToRemove);
    }

    public void getWordsWithLength(int length) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String s : words) {
            if (s.length() != length) {
                wordsToRemove.add(s);
            }
        }
        words.removeAll(wordsToRemove);
    }
}
