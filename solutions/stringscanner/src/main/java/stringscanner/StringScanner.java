package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {

        Scanner systemInScanner = new Scanner(System.in);
        System.out.println("Adjon meg egy több tagmondatból álló mondatot!");
        String sentenceByWords = systemInScanner.nextLine();

        Scanner scannerByWords = new Scanner(sentenceByWords);

        while (scannerByWords.hasNext()) {
            System.out.println(scannerByWords.next());
        }

        System.out.println();

        System.out.println("Adjon meg egy több tagmondatból álló mondatot!");
        String sentenceByClause = systemInScanner.nextLine();

        Scanner scannerByClause = new Scanner(sentenceByClause).useDelimiter(", ");

        while (scannerByClause.hasNext()) {
            System.out.println(scannerByClause.next());
        }
    }
}
