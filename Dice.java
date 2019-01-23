
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Dice
{
    private Die d1;
    private Die d2;
    
    public Dice()
    {
        d1 = new Die();
        d2 = new Die();
    }
    
    public int[] roll()
    {
        int[] result = {d1.roll(), d2.roll()};
        System.out.println("Debug: d1 roll and d2 roll " + result[0] + " " + result[1]);
        return result;
    }
}
