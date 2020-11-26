package edu.cnm.deepdive;

public class Demo {

  static int lives = 3;
  static int score;
  static int coinCount = 90;
  static boolean gameOver;

  public static void main(String[] args) {
    score += 10;
    coinCount = 75;
    lives = 0;

    if (lives == 0) {
      gameOver = true;
    }

    if (coinCount > 100) {
      System.out.println("gold medal");
    } else if (coinCount> 80) {
      System.out.println("silver medal");
    } else if (coinCount > 70) {
      System.out.println("bronze medal");
    } else {
      System.out.println("no medal");
    }
  }

}
