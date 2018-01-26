package Chapter7;

import java.util.*;

/**
 * Program to tell if two arrays are identical or not.
 *
 * @author Joshua Ables
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a set of numbers for the first array: ");
        int[] array1 = new int[input.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("enter another set of numbers for the second array: ");
        int[] array2 = new int[input.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }
        equals(array1, array2);

    }

    /**
     * Checks to see if both lists are identical
     *
     * @param array1 integer array to keep track of the first array
     * @param array2 integer array to keep track of the Second array
     * @return true or false depending on the array being the same
     */
    public static boolean equals(int[] array1, int[] array2) {
        if (java.util.Arrays.equals(array1, array2)) {
            System.out.println("the two list are strictly identical");
            return true;
        } else {
            System.out.println("the two lines are not identical");
            return false;
        }

    }

}
