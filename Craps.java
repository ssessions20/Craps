
/**
 * Write a description of class Craps here.
 *
 * @author Stuart Sessions
 * @version January 18, 2019
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        boolean firstTimePlaying = true;
        boolean keepPlaying = true;
        int winner = 0;
        Scanner sc = new Scanner(System.in);
        Dice rollers = new Dice();
        System.out.println("Would you like to play craps?(Y/N)");
        String play = sc.nextLine();
        while (play.equalsIgnoreCase("Y")) 
        //This is the main program which determines if you are in a game.
        {
            if (firstTimePlaying)
            {
                System.out.println("Do you know how to play craps?(Y/N)");
                play = sc.nextLine();
                if (play.equalsIgnoreCase("N"))
                {
                    System.out.println("To start you role two dice \n");
                    System.out.println("On your first role a 7 or 11 wins the");
                    System.out.println("game and a 2 or 12 loses it.\n");
                    System.out.println("After the first role if you haven't won");
                    System.out.println("or lost, you proceed to roll the two dice");
                    System.out.println("until they add up to your initial role or");
                    System.out.println("they add up to 7. \n");
                    System.out.println("If they add up to your initial role you win,");
                    System.out.println("but if they add up to 7 you lose.");
                }
                firstTimePlaying = false;
            }
            System.out.println("Are you ready to play?(Y/N)");
            play = sc.nextLine();
            if (play.equalsIgnoreCase("N"))
            {
                break;
            }
            System.out.println("Press the <Enter> key to roll the dice.");
            String firstRoll = sc.nextLine();
            int[] rolled = rollers.roll();
            for (int i = 0; i < rolled.length - 1;i++)
            {
                winner = rolled[i] + rolled[i+1];
                if (winner == 7 || winner == 11)
                {
                    System.out.println("You rolled a " + winner);
                    System.out.println("You won!!");
                    keepPlaying = false;
                }
                else if (winner == 2 || winner == 12 || winner == 3)
                {
                    System.out.println("You rolled a " + winner);
                    System.out.println("You Lost ;(");
                    keepPlaying = false;
                }
                else
                {
                    System.out.println("You rolled a " + winner);
                    System.out.println("You must keep playing!");
                }
            }
            /*
            while (keepPlaying)
            {
                System.out.println("
            }
            */
            System.out.println("Would you like to play again?(Y/N)");
            play = sc.nextLine();
        }
        System.out.println("Ok, goodbye!");
    }
}

