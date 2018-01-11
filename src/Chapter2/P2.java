package Chapter2;

import java.util.Scanner;

/**
 * Program combines the total of a meal, drink, a dessert price and displays it
 * to the user
 *
 * @author Ajith Melakayil
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a price for meal, drink and dessert: ");

        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();

        double foodtotal = meal + drink + dessert;
        double salestax = (meal + drink + dessert) * 0.10;
        double tip = (meal + drink + dessert + salestax) * 0.15;

        double total = meal + drink + dessert + tip + salestax;

        System.out.println("foodtotal: " + foodtotal);
        System.out.println("total: " + total);
        System.out.println("tip: " + tip);
        System.out.println("salestax: " + salestax);
    }
}
