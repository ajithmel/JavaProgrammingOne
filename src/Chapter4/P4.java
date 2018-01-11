package Chapter4;

import java.util.Scanner;

/**
 * Program asks for two bidders pay and hours, then compares them, then shows
 * you which is the best option to go for
 *
 * @author Ajith Melakayil
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of the first bidder?");
        String bidder1 = input.next();
        System.out.println("How many hours for the first bidder?");
        int hours1 = input.nextInt();
        System.out.println("How much charge for the first bidder per hour?");
        double charge1 = input.nextDouble();

        System.out.println("What is the name of the second bidder?");
        String bidder2 = input.next();
        System.out.println("How many hours for the second bidder?");
        int hours2 = input.nextInt();
        System.out.println("How much charge for the first bidder per hour?");
        double charge2 = input.nextDouble();

        double cost1 = (hours1 * charge1);
        double cost2 = (hours2 * charge2);

        if (cost1 < cost2) {
            System.out.println("The winner is " + bidder1);
            System.out.printf("Total cost is $%.2f\n", cost1);
        }

        if (cost1 > cost2) {
            System.out.println("The winner is " + bidder2);
            System.out.printf("Total cost is $%.2f\n", cost2);
        }

        if (cost1 == cost2 && hours1 < hours2) {
            System.out.println("The winner is " + bidder1);
            System.out.printf("Total cost is $%.2f\n", cost1);
            System.out.println("The number of hours is " + hours1);
        }

        if (cost1 == cost2 && hours1 > hours2) {
            System.out.println("The winner is " + bidder2);
            System.out.printf("Total cost is $%.2f\n", cost2);
            System.out.println("The number of hours is " + hours2);
        }

        if (cost1 == cost2 && hours1 == hours2) {
            System.out.println("They have identical bids and hours");
            System.out.printf("Total cost is $%.2f\n and their names are %s and %s.", cost2, bidder1, bidder2);
        }

    }
}
