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


}
