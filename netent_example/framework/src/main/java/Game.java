import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Anna on 18/02/12.
 */
public abstract class Game {
    @Autowired
    protected Randomiser randomiser;
    @Autowired
    public Stats stats;

    public abstract void play();
}
