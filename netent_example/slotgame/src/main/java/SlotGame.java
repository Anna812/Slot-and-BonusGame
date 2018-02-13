/**
 * Created by Anna on 18/02/12.
 */
public class SlotGame extends Game {
    private boolean isFree = false;

    public SlotGame(Randomiser randomiser, Stats stats) {
        super(randomiser, stats);
    }

    public void play() {
        isFreeGame();

        if(randomiser.ifRandomIsIn30Percent()) {
            stats.win += 20;
        } else if (randomiser.ifRandomIsIn10Percent()){
            isFree = true;
            stats.free++;
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
