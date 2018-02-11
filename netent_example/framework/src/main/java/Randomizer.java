package main.java;

import java.util.Random;

/**
 * Created by Anna on 18/02/11.
 */
public class Randomizer {
    private Random random;

    public Randomizer() {
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
}
