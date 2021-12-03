package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations {

    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> partsOfWord = readFromFile(path);
        String firstPart = partsOfWord.get(0);
        int lengthOfWord = firstPart.length() + partsOfWord.size() - 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lengthOfWord; i++) {
            if (i < firstPart.length()) {
                result.append(firstPart.charAt(i));
            } else {
                result.append(partsOfWord.get(i - (firstPart.length() - 1)).charAt(firstPart.length() - 1));
            }
        }
        return result.toString();
    }
}
