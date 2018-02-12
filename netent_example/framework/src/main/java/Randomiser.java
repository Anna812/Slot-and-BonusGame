import java.util.Random;

/**
 * Created by Anna on 18/02/12.
 */
public class Randomiser {
    private Random random;

    public Randomiser() {
        random = new Random();
    }

    public int roll(){
        return random.nextInt(10);
    }

    public boolean ifRandomIsIn30Percent() {
        int rolledNumber = roll();
        if(rolledNumber == 0 || rolledNumber == 1 || rolledNumber == 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ifRandomIsIn10Percent() {
        int rolledNumber = roll();
        if(rolledNumber == 0) {
            return true;
        } else {
            return false;
        }
    }
}