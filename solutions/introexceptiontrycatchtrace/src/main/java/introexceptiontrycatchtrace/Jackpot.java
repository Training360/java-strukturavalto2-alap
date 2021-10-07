package introexceptiontrycatchtrace;

import java.util.Scanner;

public class Jackpot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Winner winner = new Winner();

        try {
            System.out.println("A mai nyertes: " + winner.getWinner());
        } catch (NullPointerException npe) {
            System.out.println("Hiba történt sorsolás közben.");
        }
    }
}
