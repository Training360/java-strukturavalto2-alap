package recursion;

public class Vowels {

    public int getNumberOfVowels(String word) {
        String vowels = "aáeéiíoóöőuúüű";
        if (word.length() == 0) {
            return 0;
        }
        if (vowels.indexOf(word.charAt(0)) >= 0) {
            return 1 + getNumberOfVowels(word.substring(1));
        } else {
            return 0 + getNumberOfVowels(word.substring(1));
        }
    }
}
