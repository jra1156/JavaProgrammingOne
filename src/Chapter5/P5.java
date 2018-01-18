package Chapter5;
import java.util.Scanner;
/**
 * Program to count votes.
 * 
 * @author Joshua Ables
 */
public class P5 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
public static void main(String[] args) {
        int yes = 0;
        int no = 0;
        String n="";
        Scanner input = new Scanner(System.in);
        do{
        System.out.print(" do you vote yes or no? enter Y for yes, N for no, or press Q to exit: ");
        n = input.next();
        if( n.equalsIgnoreCase("Y"))
        {
            yes +=1;
        }
        else if (n.equalsIgnoreCase("N"))
        {
            no += 1;
        }
        else if (n.equalsIgnoreCase("Q"))
        {
            System.out.print(" the total number of yeses is " + yes +" and the total number of nos is " + no +"");
        }
        else
            System.out.print("Invalid");
        } while (!n.equalsIgnoreCase("Q"));
    }
}
