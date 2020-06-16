/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author mert_
 */

import java.util.Random;

public class Game {

    public String playerName;
    public int playerChoice;
    public boolean lock = false;
    int gamecount = 1;
    int cpuWins = 0;
    int playerWins = 0;

    Game() {}

    public String playerRoll(int choice, int roll) {
        lock = true;
        playerChoice = choice;

        gamecount++;

        if (roll == choice) {
            System.out.println("draw nobody wins");
            return "Draw! Nobody wins";
            
        } else if (roll == 1 && choice == 2) {
            System.out.println("Paper beats rock");
            System.out.println("player wins");
            playerWins++;
            return "Player Wins!";

        } else if (roll == 2 && choice == 3) {
            System.out.println("scissor beats paper");
            System.out.println("player wins");
            playerWins++;
            return "Player Wins!";

        } else if (roll == 3 && choice == 1) {
            System.out.println("rock beats scissor");
            System.out.println("player wins");
            playerWins++;
            return "Player Wins!";
            
        } else if (choice == 1 && roll == 2) {
            System.out.println("paper beats rock");
            System.out.println("cpu wins");
            cpuWins++;
            return ("CPU Wins!");

        } else if (choice == 2 && roll == 3) {
            System.out.println("scissor beats paper");
            System.out.println("cpu wins");
            cpuWins++;
            return ("CPU Wins!");

        } else if (choice == 3 && roll == 1) {
            System.out.println("Rock beats scisssor");
            System.out.println("cpu wins");
            cpuWins++;
            return ("CPU Wins!");
        }
        return ("error");
    }

    public int cpuRoll() {
        Random cpuDice = new Random();
        int cpuDiceRoll = cpuDice.nextInt(3) + 1;
        System.out.println("random dice roll: " + cpuDiceRoll);
        return cpuDiceRoll;
    }
}
