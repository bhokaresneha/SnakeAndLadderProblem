package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadder {
    static final int WINNING_POSITION = 100;
    public static void main(String[] args) {
        int playerPosition = 0;
        int dies;
        Random random =new Random();
        System.out.println(+playerPosition+" " + "This is the players starting Position");

        System.out.println("Rolls the dice to get number ");
        while (playerPosition != WINNING_POSITION) {

            dies = random.nextInt(6) + 1;
            System.out.println("dies =>"+dies);
            int option = random.nextInt( 3);
            if (option == 0) {
                System.out.println("No Play");
                playerPosition = playerPosition;
               System.out.println("Player On::"+playerPosition);
            }
            else if (option == 1) {
                System.out.println("Ladder");
                if (playerPosition+dies>WINNING_POSITION){
                    playerPosition = playerPosition-dies;
                System.out.println("Player On::"+playerPosition);}
                else{
                    playerPosition = playerPosition + dies;
                 System.out.println("Player On::"+playerPosition);}
            }
            else {
                System.out.println("Snake");
                playerPosition = playerPosition - dies;
                if (playerPosition < 0)
                    playerPosition=0;
                System.out.println("Player On::"+playerPosition);
            }
        }
    }
}

