import java.util.Scanner;

/**
 * Created by Anna on 18/02/12.
 */
public class App {
    static Scanner userInput =  new Scanner(System.in);

    public static void main(String[] args) {
        String info = "Press 1 to start SlotGame simulation, 2 for BonusGame or \"q\" to stop the program";
        Randomiser randomiser =  new Randomiser();
        Stats stats = new Stats();

        System.out.println(info);
        String input = userInput.next();
        if(input.equals("1")){
            Game slotGame = new SlotGame(randomiser, stats);
            startSimulation(slotGame);
            System.out.println("win:" + slotGame.stats.win);
            System.out.println("bet:" + slotGame.stats.bet);
            System.out.println("free:" + slotGame.stats.free);
        } else if (input.equals("2")) {
            Game bonusGame = new BonusGame(randomiser, stats);
            startSimulation(bonusGame);
        } else if (input.equalsIgnoreCase("q")) {
            System.out.println("Goodbye");
        } else {
            System.out.println(info);
        }
    }

    private static void startSimulation(Game game) {
        for(int i = 0; i < 1000000; i++) {
            game.play();
        }
    }
}
