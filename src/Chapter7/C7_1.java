package Chapter7;
import java.util.Scanner;

/**
 * Program to calculate grades.
 *
 * @author Joshua Ables
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("enter how many students you are entering: ");
        int[] numbers = new int[input.nextInt()];

        int best = 0;
        System.out.print("enter your scores: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] > best) {
                best = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Student " + i + " score is " + numbers[i] + " and grade is " + grade(numbers[i], best));
        }
    }
/**
 * assigns a grade to the number and checks for a best
 * @param numbers integer to keep track of the current number inputted 
 * @param best integer to keep track of the best number so far
 * @return letter grade in the form of a grade
 */
    public static char grade(int numbers, int best) {
        if (numbers >= best - 10) {
            return 'A';
        } else if (numbers >= best - 20) {
            return 'B';
        } else if (numbers >= best - 30) {
            return 'C';
        } else if (numbers >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
