package edu.cnm.deepdive;

public class Demo {

  static int lives = 3; //mutable/changeable
  static int score; // 0 by default
  static int coins = 40;


  public static void main(String[] args) {

    System.out.println("score= " + score);

    //score = score + 10; or
    score += 10;

    System.out.println("score= " + score + " lives= " + lives);

    //lives = lives - 1; or
    //lives -= 1; or
    lives --;

    System.out.println("score= " + score + " lives= " + lives);

    //score = score * 2; or
    score *= 2;

    System.out.println("score= " + score + " lives= " + lives);

    //coins = coins + 40;
    coins += 40;

    System.out.println("coins= " + coins);

   //comment

  }

}
