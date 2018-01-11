package Chapter5;

import java.util.Scanner;

/**
 * Program plays a game of Rock, Paper, Scissors that is all RNG.
 *
 * @author Ajith Melakayil
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerGuess, playerGuess;
        int compCount = 0, playerCount = 0;

        do {
            System.out.println("Enter a 0, 1, or 2");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);

            switch (playerGuess) {
                case 0:
                    if (computerGuess == 0) {
                        System.out.println("TIE");
                        break;
                    }
                    if (computerGuess == 1) {
                        System.out.println("Computer wins");
                        compCount++;
                        break;
                    }
                    if (computerGuess == 2) {
                        System.out.println("Player wins");
                        playerCount++;
                        break;
                    }
                case 1:
                    if (computerGuess == 1) {
                        System.out.println("TIE");
                        break;
                    }
                    if (computerGuess == 2) {
                        System.out.println("Computer wins");
                        compCount++;
                        break;
                    }
                    if (computerGuess == 0) {
                        System.out.println("Player wins");
                        playerCount++;
                        break;
                    }
                case 2:
                    if (computerGuess == 2) {
                        System.out.println("TIE");
                        break;
                    }
                    if (computerGuess == 0) {
                        System.out.println("Computer wins");
                        compCount++;
                        break;
                    }
                    if (computerGuess == 1) {
                        System.out.println("Player wins");
                        playerCount++;
                        break;

                    }
            }
        } while (playerCount <= 2 && compCount <= 2);
        System.out.println("Player wins: " + playerCount);
        System.out.println("Computer wins: " + compCount);

    }
}
