package Chapter2;
import java.util.Scanner;
/**
 * Program to calculate the price of a meal with tax.
 * 
 * @author Joshua Ables
 */
public class P2 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double tax = 0.1;
     double tip = 0.165; 
     System.out.println("What is the price of the food?");
     double meal = input.nextDouble();
     System.out.println("What is the price of the drink?");
     double drink = input.nextDouble();
     System.out.println("What is the price of the dessert?");
     double dessert = input.nextDouble();
     double food = meal + drink + dessert;
     double foodTax = food * tax;
     double foodTip = food * tip;
     double foodTotal = food + foodTax + foodTip;
     System.out.println("Your total for the food is " + food + ". Your total for the tax is " + foodTax + ". Your total for the tip is " + foodTip + ". The Grand total is " + foodTotal + ".");
    }
}
