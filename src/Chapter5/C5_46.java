package Chapter5;

import java.util.Scanner;

/**
 * Program tells the user to enter a string and then it reverses it.
 *
 * @author Ajith Melakayil
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String");

        String a = input.nextLine();

        System.out.println("Original String: " + a);
        System.out.println("Reverse String: " + (new StringBuffer(a).reverse().toString()));

    }
}
