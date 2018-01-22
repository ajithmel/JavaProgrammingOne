package Chapter7;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Program takes two lists and compares them, all by using arrays.
 *
 * @author Ajith Melakayil
 */
public class C7_26 {

    public static void main(String[] args) {
        int[] list1;
        int[] list2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers for list one: ");
        int input1 = input.nextInt();
        list1 = new int[input1];
        x(list1, input);

        System.out.println("Enter the numbers for list two: ");
        int input2 = input.nextInt();
        list2 = new int[input2];
        x(list2, input);

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are not strictly identical.");
        }
    }
    /**
     * Method that takes the array
     *
     * @param list1 takes the list in array format
     * @param Scanner takes the amount of change and then multiplies the two
     * @return returns the array
     */
    public static int[] x(int[] list1, Scanner input) {
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        return list1;
    }
    /**
     * Method that says if the arrays are equal or not
     *
     * @param list1 takes the list in array format
     * @param list2 takes the second amount in array format
     * @return returns the boolean amount based off the variables
     */
    public static boolean equals(int[] list1, int[]list2){
        if(list1.length != list2.length){
            return false;
        } 
        
        return Arrays.equals(list1, list2);
    }

}
