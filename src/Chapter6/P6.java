package Chapter6;

import java.util.Scanner;

/**
 * Program takes a password from the user and puts it through tests to see if it
 * is valid enough.
 *
 * @author Ajith Melakayil
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Euros does a dollar buy?");
        double euros = input.nextDouble();
        System.out.println("How many Pounds does a dollar buy? ");
        double pounds = input.nextDouble();
        System.out.println("How many Yen does a dollar buy? ");
        double yen = input.nextDouble();

        String response = "yes";
        while (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter an amount in USD");
            double dollars = input.nextDouble();
            System.out.println("Conversion: enter an E for Euros, P for Pounds, or Y for Yen");
            String command = input.next().toUpperCase();

            switch (command) {
                case "E":
                    double euros2 = Convert(dollars, euros);
                    System.out.printf("For %.2f USD, you will get %.2f Euros\n", dollars, euros2);
                    break;
                case "P":
                    double pounds2 = Convert(dollars, pounds);
                    System.out.printf("For %.2f USD, you will get %.2f Pounds\n", dollars, pounds2);
                    break;
                case "Y":
                    double yen2 = Convert(dollars, yen);
                    System.out.printf("For %.2f USD, you will get %.2f Yen\n", dollars, yen2);
                    break;
            }

            do {
                System.out.println("Are there more conversions");
                response = input.next();
            } while (!response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"));

        }
    }

    /**
     * Method that converts dollars into the other currency
     *
     * @param dollars it takes the amount in USD
     * @param conversion takes the amount of change and then multiplies the two
     * @return the new amount in the currency is then returned
     */
    public static double Convert(double dollars, double conversion) {

        if (dollars > 100) {
            dollars = dollars * .95;
        }
        if (dollars <= 100) {
            dollars = dollars * .9;
        }

        double total = dollars * conversion;

        return total;
    }
}
