import java.util.Random;

/**
 * Created by Anna on 18/02/12.
 */
public class Randomiser {
    private Random random;

    public Randomiser() {
        random = new Random();
    }

    public int roll(int i){
        return random.nextInt(i);
    }

    public boolean ifRandomIsIn30Percent() {
        int rolledNumber = roll(10);
        return rolledNumber == 0 || rolledNumber == 1 || rolledNumber == 2;
    }

    public boolean ifRandomIsIn10Percent() {
        int rolledNumber = roll(10);
        return rolledNumber == 0;
    }
}
