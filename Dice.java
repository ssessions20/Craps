
/**
 * The dice class rolls two Die objects and stores the values in an array.
 *
 * @author Stuart Sessions
 * @version 01/22/19
 */
import java.util.Scanner;
public class Dice
{
    private Die d1;
    private Die d2;
    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        d1 = new Die();
        d2 = new Die();
    }

    /**
     * The roll method takes two randomized dice rolls and stores them in an array.
     * 
     * @return result an array of two randomized numbers between 1-6;
     */
    public int[] roll()
    {
        int[] result = {d1.roll(), d2.roll()};
        return result;
    }
}
