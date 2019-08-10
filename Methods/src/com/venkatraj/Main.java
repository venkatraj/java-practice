package com.venkatraj;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus  = 100;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
	    displayScore(highScore);

	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;
	    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
	    displayScore(highScore);

	    int position = calculateHighScorePosition(1500);
	    displayHighScorePosition("Anand", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Babu", position);

        position = calculateHighScorePosition(601);
        displayHighScorePosition("Chitra", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Divya", position);

        position = calculateHighScorePosition(200);
        displayHighScorePosition("Elavasaran", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Guru", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayScore(int finalScore) {
        System.out.println("Your final score was " + finalScore);
    }

    public static int calculateHighScorePosition(int highScore) {
        if (highScore >= 1000) {
            return 1;
        } else if (highScore >= 500) {
            return 2;
        } else if (highScore >= 100) {
            return 3;
        }
        return 4;
    }

    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println("Congratulations " + name + "!");
        System.out.println("You secured position " + highScorePosition);
    }
}
