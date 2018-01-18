package Chapter4;

import java.util.Scanner;

/**
 * Program to display the results of a bid for a project.
 *
 * @author Joshua Ables
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter the name of the first bidder");
        System.out.println("Enter the amount of work needed ");
        System.out.println("Enter the hourly wage");
        Scanner input = new Scanner(System.in);
        String firstBidder = input.next();
        int firstHours = input.nextInt();
        double firstRate = input.nextDouble();
        System.out.println("Enter the name of the second bidder ");
        System.out.println("Enter the amount of work needed ");
        System.out.println("Enter the hourly wage");
        String secondBidder = input.next();
        int secondHours = input.nextInt();
        double secondRate = input.nextDouble();

        double firstHourCost = firstHours * firstRate;
        System.out.println("The total cost for the first bidder is $"
                + firstHourCost);
        double secondHourCost = secondHours * secondRate;
        System.out.println("The total cost for the second bidder is $"
                + secondHourCost);

        if (firstHourCost < secondHourCost) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f ",
                    firstBidder, firstHourCost);
        }
        if (secondHourCost < firstHourCost) {
            System.out.printf("\nThe winnder is %s, with a total cost of $%.2f ",
                    secondBidder, secondHourCost);
        }
        if (firstHourCost == secondHourCost && firstHours < secondHours) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f "
                    + "and a total of %d hours.", firstBidder, firstHourCost,
                    firstHours);
        }
        if (firstHourCost == secondHourCost && secondHours < firstHours) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f "
                    + "and a tota of %d hours.", secondBidder,
                    secondHourCost, secondHours);
        }
        if (firstHourCost == secondHourCost && firstHours == secondHours) {
            System.out.printf("\n%s and %s have identical bids. The hours "
                    + "required are %d and the total cost is"
                    + " $%.2f at $%.2f per hour.", firstBidder, secondBidder, firstHours,
                    firstHourCost, firstRate);
        }
    }
}
