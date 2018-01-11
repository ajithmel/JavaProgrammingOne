package Chapter4;

import java.util.Scanner;

/**
 * Program takes two strings, compares them, then tells you if they are similar
 * or a substring
 *
 * @author Ajith Melakayil
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        System.out.println("Enter another string:");

        String s1 = input.next();
        String s2 = input.next();
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a subtstring of " + s1);
        }
    }
}
