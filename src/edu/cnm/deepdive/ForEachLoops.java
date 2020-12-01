package edu.cnm.deepdive;

public class ForEachLoops {

  static String[] pets = {"doge1", "doge2", "doge3"}; //anonymous array

  static int[][] table = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };

  public static void main(String[] args) {

    for (int i = 0; i < pets.length; i++) {
      // 1st iteration i = 0
      // 2nd iteration i = 1
      // 3rd iteration i = 2
      // 4th iteration i = 3, 3 < 3, loop finishes
      System.out.println("pet[" + i + "]=" + pets[i]);
    }

    for (String pet : pets) {
      System.out.println("pet=" + pet);
    }

    for (int row = 0; row < table.length; row++) {
      for (int column = 0; column < table[row].length; column++) {
        System.out.println("number= " + table[row][column]);
      }
    }

  }

}
