package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate gratuity.
 *
 * @author Joshua Ables
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a gratuity rate");
        double gratrate = input.nextDouble();
        System.out.println("Enter a subtotal");
        double subtotal = input.nextDouble();
        double gratuity = gratrate / 100 * subtotal;
        double total = gratuity + subtotal;
        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }

}
