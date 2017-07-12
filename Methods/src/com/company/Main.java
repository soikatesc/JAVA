package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score was " + finalScore);
        }
    }
}
