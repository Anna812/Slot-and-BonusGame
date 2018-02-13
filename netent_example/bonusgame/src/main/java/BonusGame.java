import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Anna on 18/02/12.
 */
public class BonusGame extends Game {
    private boolean isBonus = false;

    public BonusGame(Randomiser randomiser, Stats stats) {
        super(randomiser, stats);
    }

    public void play() {
        if(isBonus) {
            startBoxGame();
        } else {
            placeBet();
        }
    }

    private void placeBet() {
        stats.bet += 10;
        if(randomiser.ifRandomIsIn10Percent()) {
            stats.bonus++;
            isBonus = true;
        }
    }

    private void startBoxGame() {
        ArrayList<Integer> boxes = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(boxes);
        int numberOfLoserBox = randomiser.roll(5) + 1;

        for(int i = 0; i < 4; i++ ) {
            if(boxes.get(i) != numberOfLoserBox) {
                stats.win += 5;
                stats.winnerBoxPicked++;
            }
        }
        isBonus = false;
    }
}
