package Chapter7;

public class C7_9 {
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
    public static double min(double[] array, double min){
        for (int i = 1; i < array.length; i++){
            if (array[i] <= min) min = array[i];
        }
        return min;
    }
}
