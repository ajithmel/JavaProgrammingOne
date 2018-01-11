package Chapter3;

import java.util.Scanner;

/**
 * Program takes an integer and shows if it is divisible by different ways
 *
 * @author Ajith Melakayil
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");

        int number = input.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("number " + number + "is divisible by 5 and 6");
        } else {
            System.out.println("number " + number + " is not devisible by 5 and 6 ");
        }

        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("number " + number + " is divisible by 5 or 6");
        } else {
            System.out.println("number " + number + " is not divisible by 5 or 6");

        }

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("number " + number + " is divisible by 5 or 6" + " but not both");
        } else {
            System.out.println("number " + number + " is not divisible by 5 or 6" + " but not both");
        }
    }
}
