package Chapter2;

import java.util.Scanner;

/**
 * Program finds the about of tip and adds it to the subtotal to combine to a
 * final a total number value
 *
 * @author Ajith Melakayil
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total, subtotal, gratiuity;
        System.out.println("Enter the subtotal and a gratiuity");
        subtotal = input.nextDouble();
        gratiuity = input.nextDouble();

        double rate = (gratiuity / 100) * subtotal;
        total = subtotal + gratiuity;
        System.out.println("The gratiuity is " + gratiuity + "total is " + subtotal);
    }
}
