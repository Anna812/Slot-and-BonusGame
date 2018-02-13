/**
 * Created by Anna on 18/02/12.
 */
public abstract class Game {
    protected Randomiser randomiser;
    public Stats stats;

    public Game(Randomiser randomiser, Stats stats){
        this.randomiser = randomiser;
        this.stats = stats;
    }

    public abstract void play();
}
