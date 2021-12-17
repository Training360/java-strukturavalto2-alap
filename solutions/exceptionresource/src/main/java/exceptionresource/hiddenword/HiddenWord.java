package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            return getWord(scanner);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String getWord(Scanner scanner) {
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char letter = getLetterInLine(line);
            sb.append(letter);
        }
        return sb.toString();
    }

    private char getLetterInLine(String line) {
        for (char c : line.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return c;
            }
        }
        return ' ';
    }
}
