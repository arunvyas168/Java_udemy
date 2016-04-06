package com.company;

public class Main {

    public static void main(String[] args) {
        int playerScore = 50;
        int  highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition("Arun",highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            return (score + (levelCompleted * bonus));
            //System.out.println("Your final score was " + finalScore);
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into position "+ position + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if ((playerScore>=500)&&(playerScore<1000)){
            return 2;
        } else if ((playerScore>=100)&&(playerScore<500)){
            return 3;
        } else {
            return 4;
        }
    }
}
