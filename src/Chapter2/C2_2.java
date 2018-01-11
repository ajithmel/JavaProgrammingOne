package Chapter2;

import java.util.Scanner;

/**
 * Program finds the area and the volume of a shape, that is user inputted
 *
 * @author Ajith Melakayil
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        double radius, area, length, volume;
        System.out.print("Enter the radius and length of a cylinder");

        radius = r.nextDouble();
        length = r.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        volume = area * length;

        System.out.println("The Area is " + area);
        System.out.println("The Volume is " + volume);
    }
}
