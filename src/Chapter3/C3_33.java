package Chapter3;
import java.util.Scanner;
/**
 * Calculates deals on packaging.
 * 
 * @author Joshua Ables
 */
public class C3_33 {
            /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of package 1:");
        int weight1 = input.nextInt();
        System.out.println("Enter the price of package 1:");
        double price1 = input.nextDouble();
        System.out.println("Enter the weight of package 2:");
        int weight2 = input.nextInt();
        System.out.println("Enter the price of package 2:");
        double price2 = input.nextDouble();
        double pak2 = weight2 / price2;
        double pak1 = weight1 / price1;
        if(pak1 < pak2)
            System.out.println("The second package is a better deal than package 1");
        else
            System.out.println("The first package is a better deal than package 2");
    }

}
