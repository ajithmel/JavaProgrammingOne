package Chapter7;
    /**
 * Program shows the minimum number in the amount of numbers that is inserted into an array
 * @author Ajith Melakayil
 */
public class C7_9 {
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] values = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        double smallest = values[0];
        System.out.println("The minimum number is: " + min(values, smallest));
    }
     /**
     * Method that shows the minimum number
     *
     * @param array takes the first array
     * @param min is the amount of minimum number
     * @return returns the boolean amount based off the variables
     */
    public static double min(double[] array, double min){
        for (int i = 1; i < array.length; i++){
            if (array[i] <= min) min = array[i];
        }
        return min;
    }
}
