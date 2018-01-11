package Chapter2;

import java.util.Scanner;

/**
 * Program converts a value in Celsius to a value in Fahrenheit
 *
 * @author Ajith Melakayil
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("Celsius " + celsius + " is "
                + fahrenheit + " in Fahrenheit");
    }
}
