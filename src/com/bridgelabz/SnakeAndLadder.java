package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder
{

    public static void main(String[] args) {
        int playerPosition = 0;

        System.out.println(+playerPosition+" " + " is the players starting Position");
        Random random = new Random();
        int dies = random.nextInt(6) + 1;
        System.out.println("Number on dies =" + dies);

    }
}