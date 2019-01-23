
/**
 * The die class constructs a single die and produces a randomized number between 1-6.
 *
 * @author Stuart Sessions
 * @version 01/22/19
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = roll();
    }

    /**
     * The roll method returns a random number between 1-6.
     *
     * 
     * @return roll a random int value from 1-6
     */
    public int roll()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
}
