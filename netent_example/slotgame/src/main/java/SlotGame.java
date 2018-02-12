import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Anna on 18/02/12.
 */
public class SlotGame implements IGame {

    @Autowired
    private Randomiser randomiser;
    @Autowired
    public Stats stats;

    boolean isFree;

    public void play() {
        isFreeGame();

        if(randomiser.ifRandomIsIn30Percent()) {
            stats.win += 20;
        } else if (randomiser.ifRandomIsIn10Percent()){
            isFree = true;
        }
    }

    private void isFreeGame() {
        if(!isFree){
            stats.bet +=10;
        } else {
            isFree = false;
        }
    }
}
