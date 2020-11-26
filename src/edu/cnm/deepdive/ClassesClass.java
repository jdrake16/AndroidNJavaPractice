package edu.cnm.deepdive;

public class ClassesClass {

  public static void main(String[] args) {

//    class User {
//
//      int score;
//
//      public boolean hasWon() {
//
//        if (score >= 100) {
//
//          return true;
//
//        } else {
//
//          return false;
//        }
//
//      }
//
//    }
//        User bob = new User();
//
//        bob.score = 100;
//
//        System.out.println(bob.hasWon());

    class Number {

      int num;

      public boolean isPositive() {

        if (num > 0) {

          return true;

        } else {

          return false;

        }
      }
    }

    Number myNum = new Number();

    myNum.num = 5;

    if (myNum.isPositive()) {

    System.out.println(myNum.num + " is positive");

  } else {

      System.out.println(myNum.num + " is not positive");

    }

  }

}



