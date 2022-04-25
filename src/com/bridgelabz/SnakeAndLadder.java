package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder
{
    static final int WINNING_POSITION=100;

    public static void main(String[] args) {
        int playerPosition = 0;

        System.out.println(+playerPosition+" " + " is the players starting Position");
        Random random = new Random();
        System.out.println("roll the die to get number");
        while(playerPosition!=WINNING_POSITION)
        {
            int dies = random.nextInt(6) + 1;
            System.out.println("Number on dies =" + dies);

            // generating random options of ladder snake and player
            int option=random.nextInt(3);

            if (option == 0) {
                // System.out.println("No Play");
                playerPosition = playerPosition;
            }else if (option == 1)
                {
                    //System.out.println("Ladder");
                    if (playerPosition>WINNING_POSITION)
                      playerPosition = playerPosition- dies;
                        else
                        playerPosition = playerPosition + dies;

                }
                else {
                         //System.out.println("Snake");
                        playerPosition = playerPosition - dies;
                        if (playerPosition < 0)
                            playerPosition=0;

        }

            playerPosition++;
        }
        System.out.println("Player Position::"+playerPosition);

   
    }
      
}