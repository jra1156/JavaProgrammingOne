package Chapter5;
import java.util.Scanner;
/**
 * Program to Reverse a string.
 * 
 * @author ja0962305
 */
public class C5_46 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s1 = input.nextLine();
        System.out.println("The reversed string is " + (new StringBuffer(s1).reverse().toString()));
        
    }
}
