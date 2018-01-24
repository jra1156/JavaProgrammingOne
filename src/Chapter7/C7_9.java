package Chapter7;

import java.util.*;

/**
 * Program to calculate the minimum number in an array.
 *
 * @author Joshua Ables
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        Arrays.sort(array);
        System.out.print("The minimum number is: " + array[0] + ".");
    }
}
