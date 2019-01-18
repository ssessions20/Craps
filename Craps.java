
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play craps?(Y/N)");
        String play = sc.nextLine();
        if (play.equalsIgnoreCase("Y"))
        {
            System.out.println("Do you know how to play craps?(Y/N)");
            play = sc.nextLine();
            if (play.equalsIgnoreCase("N"))
            {
                
            }
        }
        else
        {
            
        }
    }
}
