package Chapter5;

import java.util.Scanner;

/**
 * Program adds up yes, no, invalid, and total votes by using a loop.
 *
 * @author Ajith Melakayil
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Ytally = 0;
        int Ntally = 0;
        int Itally = 0;
        String a;
        char b;

        do {
            System.out.println("Enter Y for yes, N for no, or Q to quit voting");
            a = input.nextLine().toUpperCase();
            b = a.charAt(0);
            if (b == 'Y') {
                Ytally++;

            }
            if (b == 'N') {
                Ntally++;

            }
            if (b != 'Y' && b != 'N' && b != 'Q') {
                System.out.println("INVALID INPUT! Enter Y for yes, N for no, or Q to quit voting");
                Itally++;

            }

        } while (b != 'Q');
        int Total = Ytally + Ntally + Itally;

        System.out.println("Yes votes: " + Ytally);
        System.out.println("No votes: " + Ntally);
        System.out.println("Invalid votes: " + Itally);
        System.out.println("Total votes: " + Total);

    }
}
