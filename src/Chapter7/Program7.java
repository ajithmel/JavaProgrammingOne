package Chapter7;

import java.util.Scanner;
import java.util.Arrays;
    public class Program7 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            double[] numbers;
            
            
            System.out.println("Enter numbers to make an array");
            int arraysize = input.nextInt();
            numbers = new double[arraysize];
            
            input(numbers, arraysize);
            System.out.println("The average is " + aveRAGE(numbers, arraysize));
            System.out.println(Arrays.toString(numbers));
            
        }
        
        public static void input(double[] array, int arraysize){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter " + arraysize + " variables");
            for (int i = 0; i < arraysize; i++){
                array[i] = input.nextDouble();
            }
            aveRAGE(array, arraysize);
            
            
        }
        public static double aveRAGE(double[] array, double arraysize){
            
        double average = 0;    
            for (int i = 0; i < arraysize; i++){
                average += array[i];
            }
        average = (average / arraysize);
        return average; }
        
    }