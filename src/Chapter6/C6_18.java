package Chapter6;

import java.util.Scanner;

/**
 * Program takes a password from the user and puts it through tests to see if it
 * is valid enough.
 *
 * @author Ajith Melakayil
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password");

        String password = input.nextLine();

        if (isValid(password)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

    }

    /**
     * Method to check if the password is valid
     *
     * @param password the String password to convert it
     * @return a boolean variable that verifies if the password is valid or not
     */
    public static boolean isValid(String password) {

        int counter = 0;
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }

        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }

        }
        if (counter < 2) {
            return false;
        }

        return true;
    }

}
