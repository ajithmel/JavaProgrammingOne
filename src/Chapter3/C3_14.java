package Chapter3;

import java.util.Scanner;

/**
 * Program is a simple game of heads or tails
 *
 * @author Ajith Melakayil
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int guess = 0;

        String player;

        System.out.println("Enter a guess: ");

        player = input.next();

        if (player.equals("heads ")) {

            guess = 1;

        } else if (player.equals("tails")) {

            guess = 0;
        }

        int number1 = (int) (Math.random() * 2);

        if (number1 == guess) {
            System.out.println("You are correct! ");

        } else if (number1 != guess) {
            System.out.println("You are incorrect! ");

        }
    }
}
