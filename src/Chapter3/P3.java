package Chapter3;
import java.util.Scanner;
/**
 * This program helps to learn if statements and other odds and ends
 * 
 * @author Joshua Ables
 */
public class P3 {
            /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numbA;
        double numbB;
        double numbC;
        System.out.println("Input the first number: ");
        numbA = input.nextInt();
        System.out.println("Input the second number: ");
        numbB = input.nextInt();
        if (numbA > numbB)
            System.out.println("The first number is greater than the second number");
        if (numbB > numbA)
            System.out.println("The first number is less than the second number");
        if (numbA == numbB)
            System.out.println("The First and Second numbers are equal");
        if (numbA > numbB || numbA == numbB)
            System.out.println("The first number is greater than or equal to the second number");
        if (numbB > numbA || numbA == numbB)
            System.out.println("The first number is less than or equal to the second number");
        if (numbA != numbB)
            System.out.println("The First and Second numbers are not equal");
        if (numbB == 0)
            System.out.println("Cannot divide by zero");
        if (numbA / numbB < 1)
            System.out.println("Proper Fraction");
        else 
            System.out.println("Improper Fraction");
        if (numbA >= 90)
            System.out.println("A");
        else
            if (numbA >= 80)
            System.out.println("B");
        else
            if (numbA >= 70)
            System.out.println("C");
        else
            if (numbA >= 60)
            System.out.println("D");
        else
            System.out.println("F");
        if (numbB >= 1 && numbB <= 100)
            System.out.println("In Range");
        else 
            System.out.println("Out of Range");
    }    
}
