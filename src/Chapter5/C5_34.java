package Chapter5;
import java.util.Scanner;
/**
 * Program to play Rock, Paper, Scissors.
 * 
 * @author Joshua Ables
 */
public class C5_34 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int Win = 0;
        int Lose = 0;
        Scanner input = new Scanner(System.in);
        do{
           System.out.print("Let's play rock, paper, scissors 0 for Rock, 1 for paper, and 2 for scissors: ");
           int playerGuess = input.nextInt();
           int compGuess = (int)(Math.random() * 3);
           switch(playerGuess){
               case 0:
                   if(compGuess == 0)
                       System.out.println("It's a tie");
                   if(compGuess == 1){
                       System.out.println("You lost");
                        Lose = Lose + 1;}
                   if(compGuess == 2){
                       System.out.println("You Win!");
                        Win = Win + 1;}
                   break;
               case 1:
                   if(compGuess == 0){
                       System.out.println("You Win!");
                        Win = Win + 1;}
                   if(compGuess == 1)
                       System.out.println("It's a tie");
                   if(compGuess == 2){
                       System.out.println("You lost");
                        Lose = Lose + 1;}
                   break;
               case 2:
                   if(compGuess == 0){
                       System.out.println("You lost");
                        Lose = Lose + 1;}
                   if(compGuess == 1){
                       System.out.println("You Win!");
                        Win = Win + 1;}
                   if(compGuess == 2)
                       System.out.println("It's a Tie"); 
                   break;
           }
        }while(Win <= 2 && Lose <= 2);
                   
           }
}
