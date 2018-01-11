package Chapter3;
import java.util.Scanner;
/**
 * Program to detect a number's relation to 5 and 6 in division.
 * 
 * @author Joshua Ables
 */
public class C3_26 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int Number = input.nextInt();
        if (Number % 5 == 0 && Number % 6 == 0)
            System.out.println("Is " + Number + " able to be divided by 5 and 6? True");
        else
            System.out.println("Is " + Number + " able to be divided by 5 and 6? False");
        if (Number % 5 == 0 || Number % 6 == 0)
            System.out.println("Is " + Number + " able to be divided by 5 or 6? True");
        else
            System.out.println("Is " + Number + " able to be divided by 5 or 6? False");
        if (Number % 5 == 0 ^ Number % 6 == 0)
            System.out.println("Is " + Number + " able to be divided by 5 or 6, but not both? True");
        else
            System.out.println("Is " + Number + " able to be divided by 5 or 6, but not both? False");
    }

}
