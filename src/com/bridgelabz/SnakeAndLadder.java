package com.bridgelabz;

import java.security.PublicKey;
import java.util.Random;

public class SnakeAndLadder
{
    public static int WINNING_POSITION=100;
    public static void main(String[] args) {
        int playerPosition = 0;

        System.out.println(+playerPosition + " " + " is the players starting Position");
        Random random = new Random();
        while (playerPosition != WINNING_POSITION) {
            int dies = random.nextInt(6) + 1;
            System.out.println("Number on dies =" + dies);

            // generating random options of ladder snake and player
            int option = random.nextInt(3);
            if (option == 0) {
                System.out.println("No Play");
                playerPosition = playerPosition;
                System.out.println(playerPosition);
            } else if (option == 1) {
                System.out.println("Ladder");
                playerPosition = playerPosition + dies;
                System.out.println(playerPosition);
            } else {
                System.out.println("Snake");
                playerPosition = playerPosition - dies;
                System.out.println(playerPosition);
            }

        }
    }
}
