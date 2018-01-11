package Chapter3;
import java.util.Scanner;
/**
 * Program to guess heads or tails
 * 
 * @author Joshua Ables
 */
public class C3_14 {
            /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsTails = (int) (Math.random() * 2);
        System.out.println("Choose Heads or Tails. 0 for heads and 1 for tails");
        int guess = input.nextInt();
        if (headsTails == guess)
            System.out.println("You were right, good job!");
        else
            System.out.println("You were wrong, try again!");
    }

}
