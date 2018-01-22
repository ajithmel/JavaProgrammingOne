package Chapter8;

import java.util.Scanner;
public class Program8 {
/**
 * Program allows numbers to be inputted to a list for emplotees' spreadsheet using arrays
 *
 * @author Ajith Melakayil
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int person = 0;
        int day = 0;
        double[][] workarray = new double[4][5];
        String entireweek[] = {"Sunday","Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday",};
        String employee;
        String week;
        String amount;
        do {
            do {
                System.out.println("Enter an A, B, C, or D to go that employee");
                employee = input.next().toUpperCase();
            } while (!employee.equals("A") && !employee.equals("B") && !employee.equals("C") && !employee.equals("D"));

            switch (employee) {
                case "A":
                    person = 0;
                    break;
                case "B":
                    person = 1;
                    break;
                case "C":
                    person = 2;
                    break;
                case "D":
                    person = 3;
                    break;
            }
            do {
                System.out.println("Enter a M, T, W, H, or F to go to that day");
                week = input.next().toUpperCase();
            } while (!week.equals("M") && !week.equals("T") && !week.equals("W") && !week.equals("H") && !week.equals("F"));

            switch (week) {
                case "M":
                    day = 0;
                    break;
                case "T":
                    day = 1;
                    break;
                case "W":
                    day = 2;
                    break;
                case "H":
                    day = 3;
                    break;
                case "F":
                    day = 4;
                    break;
            }
            System.out.println("Enter the amount of the sale: ");
            workarray[person][day] += input.nextDouble();
            do {
                System.out.println("Enter Y or N to continue or to not");
                amount = input.next().toUpperCase();
            } while (!amount.equals("Y") && !amount.equals("N"));
        } while (!amount.equals("N"));
        for (int i = 0; i < workarray.length; i++) {
            System.out.print("Employee " + i);
            for (int p = 0; p < workarray[i].length; p++) {
                System.out.print("\t" + workarray[i][p]);
            }
            System.out.println();
        }
    }
}
