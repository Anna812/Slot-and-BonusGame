package main.java;

import java.util.Scanner;

/**
 * Created by Anna on 18/02/11.
 */
public class SlotGameApp {
    static Scanner userInput =  new Scanner(System.in);

    public static void main(String[] args) {
        String info = "Press Enter to start simulation or q to stop the program";
        System.out.println(info);

        if(userInput.nextLine().equals("")){
            startSlotGameSimulation();
        } else if (userInput.next().equalsIgnoreCase("q")) {
            System.out.println("Goodbye");
        } else {
            System.out.println(info);
        }
    }

    private static void startSlotGameSimulation() {
    }
}
