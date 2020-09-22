package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class LoopPractice {

  public static void main(String[] args) {

//    int x = 1;
//
////    while (x <= 5) {
////
////      System.out.println(2 * x);
////
//////      x = x + 1; can be simplified to x++.
////      x++;
////
////    }

    // this loop starts off at 5 and continually goes down by 1.

//    for (int y = 5; y > 0; y--) {
//
//      System.out.println(y);
//
//    }

//    for (int z = 3; z <= 30; z = z + 3 ) {
//
//      System.out.println(z);
//
//    }

//    int j = 1;
//
//    while (j < 11) {
//
//      System.out.println(j * 3);
//
//      j++;
//
//    }

//    int b = 1;
//    int triangularNumber = 1;
//
//    while (b <= 10) {
//
//      System.out.println(triangularNumber);
//
//      b++;
//
//      triangularNumber = triangularNumber + b;
//
//    }

    // how to create a basic array.

//    String[] theFamily = {"me", "myself", "I", "and I and I"};
//
//    for (String name : theFamily) {
//
//      System.out.println(name);
//    }

    List<String> familia = new ArrayList<>();

    familia.add("me");
    familia.add("myself");
    familia.add("I");

    for (String name : familia) {

      System.out.println(name);
    }



  }

}
