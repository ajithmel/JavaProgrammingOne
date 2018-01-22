package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program shows shows an array and then shows the average of all the numbers
 * combined
 *
 * @author Ajith Melakayil
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers;

        System.out.println("Enter numbers to make an array");
        int arraysize = input.nextInt();
        numbers = new double[arraysize];

        input(numbers, arraysize);
        System.out.println("The average is " + aveRAGE(numbers, arraysize));
        System.out.println(Arrays.toString(numbers));

    }

    /**
     * Method takes the amount of numbers inside the array
     *
     * @param array takes the first array
     * @param arraysize is the amount of numbers in the number
     */
    public static void input(double[] array, int arraysize) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + arraysize + " variables");
        for (int i = 0; i < arraysize; i++) {
            array[i] = input.nextDouble();
        }
        aveRAGE(array, arraysize);

    }

    /**
     * Method shows and calculates the average
     *
     * @param array takes the first array
     * @param arraysize is the amount of numbers inside the array
     * @return returns the average number after it is all calculated
     */
    public static double aveRAGE(double[] array, double arraysize) {

        double average = 0;
        for (int i = 0; i < arraysize; i++) {
            average += array[i];
        }
        average = (average / arraysize);
        return average;
    }

}
