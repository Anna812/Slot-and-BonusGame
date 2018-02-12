package main.java;

import java.util.Scanner;

/**
 * Created by Anna on 18/02/12.
 */
public class App {
    static Scanner userInput =  new Scanner(System.in);

    public static void main(String[] args) {
        String info = "Press 1 to start SlotGame simulation, 2 for BonusGame or \"q\" to stop the program";
        System.out.println(info);

        if(userInput.next().equals(1)){
            play();
        } else if (userInput.next().equals(2)) {
            play();
        } else if (userInput.next().equalsIgnoreCase("q")) {
            System.out.println("Goodbye");
        } else {
            System.out.println(info);
        }
    }
}
