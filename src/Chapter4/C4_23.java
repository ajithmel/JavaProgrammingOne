package Chapter4;

import java.util.Scanner;

/**
 * Program takes an employee's credentials and displays them with the printf
 * method
 *
 * @author Ajith Melakayil
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name: ");
        System.out.println("Enter number of hours worked: ");
        System.out.println("Enter hourly pay rate: ");
        System.out.println("Enter federal tax witholding rate: ");
        System.out.println("Enter state tax withholding rate: ");

        String name = input.next();
        double hours = input.nextDouble();
        double payrate = input.nextDouble();
        double fedtax = input.nextDouble();
        double fedtax1 = (fedtax * 100);
        double statetax = input.nextDouble();
        double statetax1 = (statetax * 100);
        double grosspay = (hours * payrate);
        double statetax2 = (grosspay * statetax);
        double fedtax2 = (grosspay * fedtax);
        double deduction = (fedtax2 + statetax2);
        double netpay = (grosspay - deduction);

        System.out.println("Name: " + name);
        System.out.println("Hours: " + hours);
        System.out.printf("Pay rate: $%4.2f\n", payrate);
        System.out.printf("Gross pay: $%4.2f\n", grosspay);
        System.out.println("Deductions: ");
        System.out.printf("     Federal Withholding: %4.2f | %4.2f\n", fedtax1, fedtax2);
        System.out.printf("     State Witholding: %4.2f | %4.2f\n ", statetax1, statetax2);
        System.out.printf("    Total cost: = %4.2f\n ", deduction);
        System.out.printf("Net pay: %4.2f\n ", netpay);

    }
}
