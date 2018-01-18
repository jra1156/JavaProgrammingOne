package Chapter2;

import java.util.Scanner;

/**
 * Program to find the area and volume.
 *
 * @author Joshua Ables
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius = input.nextDouble();
        System.out.println("Enter a length");
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The area is " + area + ". Volume is" + volume);
    }

}
