import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Anna on 18/02/12.
 */
public class BonusGame implements IGame {
    @Autowired
    private Randomiser randomiser;

    public void play() {

    }
}
