package edu.cnm.deepdive;

public class DemoTwo {

  static int lives = 5;
  static int coins = 90;

  public static void main(String[] args) {

    while (lives > 0) {  // <-- loops while this condition is true ("while" checks condition and then executes code)
      System.out.println("lives= " + lives);
      lives --; // same as lives = lives - 1;
    }

    lives = 5;

    do {    // "do while" executes code and then checks condition
      coins += 20;
      lives --;
    } while (lives > 0); // "do while" requires a semicolon "while" does not

    System.out.println("coins= " + coins + " lives= " + lives);

  }

}
