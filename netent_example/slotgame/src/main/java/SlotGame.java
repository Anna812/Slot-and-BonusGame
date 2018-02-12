import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Anna on 18/02/12.
 */
public class SlotGame implements IGame {

    @Autowired
    private Randomiser randomiser;

    boolean isFree;

    public void play() {
        isFreeGame();

        if(randomiser.ifRandomIsIn30Percent()) {
            // add 20 coins
        } else if (randomiser.ifRandomIsIn10Percent()){
            isFree = true;
        } else {
            // log lost game
        }
    }

    private void isFreeGame() {
        if(!isFree){
            // -10 coins
        } else {
            isFree = false;
        }
    }
}
