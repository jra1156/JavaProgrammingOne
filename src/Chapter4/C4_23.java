package Chapter4;

import java.util.Scanner;

/**
 * Program to display worker's hours worked, pay, and tax witholdings.
 *
 * @author Joshua Ables
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the worker’s name: ");
        String name = input.next();
        System.out.print("How many hours worked: ");
        double Hour = input.nextDouble();
        System.out.print("What is the hourly pay: ");
        double Hourrate = input.nextDouble();
        System.out.print("What is federal tax withholding rate: ");
        double Fedtax = input.nextDouble();
        System.out.print("What is state tax withholding rate: ");
        double Statetax = input.nextDouble();
        System.out.printf("The worker’s name is %s", name);
        System.out.printf("\nHours they worked: %.2f", Hour);
        System.out.printf("\nPay the pay rate is $%.2f", Hourrate);
        System.out.printf("\nGross the pay is $%.2f", (Hourrate * Hour));
        System.out.print("\nDeductions:");
        double Grosspay = Hourrate * Hour;
        double Fedwithhold = Grosspay * Fedtax;
        double Statewithhold = Grosspay * Statetax;
        System.out.printf("\n\tFederal Withholding (%.2f%%):$%.2f\n", Fedtax * 100, Fedwithhold);
        System.out.printf("\tState Deduction (%.2f%%):$%.2f\n", Statetax * 100, Statewithhold);
        System.out.printf("\tTotal Deduction: $%.2f", Fedwithhold + Statewithhold);
        System.out.printf("\nNet Pay: $%.2f\n", Grosspay - (Fedwithhold + Statewithhold));
    }

}
