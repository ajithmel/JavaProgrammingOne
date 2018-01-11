package Chapter4;

import java.util.Scanner;

/**
 * Program takes a letter (for your major) and a number (for your grade) and
 * displays it
 *
 * @author Ajith Melakayil
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter ");
        System.out.println("and a number");

        String a = input.nextLine().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);

        if ((b == 'M' || b == 'C' || b == 'I') && (c == '1' || c == '2' || c == '3' || c == '4')) {

            switch (b) {
                case 'M':
                    System.out.println("Mathematics");
                    break;
                case 'C':
                    System.out.println("Computer Science");
                    break;
                case 'I':
                    System.out.println("Information Technolgy");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            switch (c) {
                case '1':
                    System.out.println("Freshman");
                    break;
                case '2':
                    System.out.println("Sophomore");
                    break;
                case '3':
                    System.out.println("Junior");
                    break;
                case '4':
                    System.out.println("Senior");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;

            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
