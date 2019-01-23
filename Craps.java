
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
        boolean firstTimePlaying = true; //This variable makes it so the rules aren't told twice.
        boolean keepPlaying = true; //Whether or not the user has won/lost
        int winner = 0; //This is the number the user rolls for after round 1.
        Scanner sc = new Scanner(System.in);
        Dice rollers = new Dice();
        System.out.println("Would you like to play craps?(Y/N)");
        String play = sc.nextLine();
        while (play.equalsIgnoreCase("Y")) 
        //This is the main program which determines if you are in a game.
        {
            keepPlaying = true;
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
                    System.out.println("but if they add up to 7 you lose. \n");
                }
                firstTimePlaying = false;
            }
            System.out.println("Press the <Enter> key to roll the dice.");
            String firstRoll = sc.nextLine();
            int[] rolled = rollers.roll();
            for (int i = 0; i < rolled.length - 1;i++) //This just decides what happens after the first role
            //by taking the sum of the array created in Dice's role method.
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
                    System.out.println("You lost ;(");
                    keepPlaying = false;
                }
                else
                {
                    System.out.println("You rolled a " + winner);
                    System.out.println("You must keep playing!");
                }
            }

            while (keepPlaying) //This loop activates if the game doesn't end after the first round.
            {
                System.out.println("Press the <Enter> key to roll the dice.");
                firstRoll = sc.nextLine(); //The variable doesn't matter because thye just have to press enter
                rolled = rollers.roll();
                int diceSum = rolled[0] + rolled[1];
                System.out.println("Your point is " + winner);
                if (diceSum == winner)
                {
                    System.out.println("You rolled a " + diceSum);
                    System.out.println("You won!!");
                    keepPlaying = false;
                }
                else if (diceSum == 7)
                {
                    System.out.println("You rolled a " + diceSum);
                    System.out.println("You lost ;(");
                    keepPlaying = false;
                }
                else
                {
                    System.out.println("You rolled a " + diceSum);
                    System.out.println("You must keep playing!");
                }
            }

            System.out.println("Would you like to play again?(Y/N)");
            play = sc.nextLine();
        }
        System.out.println("Ok, goodbye!");
    }
}

