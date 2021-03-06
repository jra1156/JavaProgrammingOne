package Chapter7;

import java.util.*;

/**
 * Program to determine the average from the numbers in an array
 *
 * @author Joshua Ables
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers you are doing: ");
        double[] numbers = new double[input.nextInt()];

        System.out.println("The average is " + method1(numbers, input));
        method2(numbers);

    }

    /**
     * Returns the average of the array numbers
     *
     * @param numbers double to keep track of how many numbers are being entered
     * @param input scanner from that will be able to track input
     * @return the average of the numbers
     */
    public static double method1(double[] numbers, Scanner input) {
        double sum = 0;
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        return (sum / numbers.length);
    }

    /**
     * Shows the content of the array
     *
     * @param numbers double to keep track of how many numbers are being entered
     */
    public static void method2(double[] numbers) {
        System.out.print("Contents of the array " + Arrays.toString(numbers));
    }
}
