package Chapter3;

import java.util.Scanner;

/**
 * Program takes the weight and price for two items, compares them, then shows
 * which is better
 *
 * @author Ajith Melakayil
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an weight and price for product one: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.println("Enter an weight for product two: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double total1 = price1 / weight1;

        double total2 = price2 / weight1;
        if (total1 > total2) {
            System.out.println("Product two has a better price ");

        } else {

            System.out.println("Product one has a better price ");

        }

    }
}
