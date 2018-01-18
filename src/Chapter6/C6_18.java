package Chapter6;

import java.util.Scanner;

/**
 * Program to test a password's validity.
 *
 * @author Joshua Ables
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a password that has at least 8 characters and at least 2 digits: ");
        String password = input.nextLine();
        password(password);
    }

    public static void password(String password1) {
        int counter = 0;
        if (password1.length() < 8) {
            System.out.println("ERROR: Your password is too short.");
        }

        for (int i = 0; i < password1.length(); i++) {
            if ((Character.isLetterOrDigit(password1.charAt(6)))) {
                if (Character.isDigit(password1.charAt(i))) {
                    ++counter;
                }
            }
            //System.out.println(counter);
        }
        if (counter <= 1) {
            System.out.println("ERROR: Your password needs more special characters.");
        }
        if (counter >= 2) {
            System.out.println("Your password is correct.");
        }
    }
}
