package Chapter4;

import java.util.Scanner;

/**
 * Program to detect substrings
 *
 * @author Joshua Ables
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter the first string: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        System.out.println("Enter the second string");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " isn’t a substring of " + s1);
        }
    }
}
