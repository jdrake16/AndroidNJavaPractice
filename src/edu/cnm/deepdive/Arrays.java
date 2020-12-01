package edu.cnm.deepdive;

public class Arrays {

  static int[] names = new int[4]; // initialize new array with four elements

  static String[] pets = {"doge1", "doge2", "doge3"}; //anonymous array

  static int[][] table = new int[3][3]; // array of arrays

  static String[][] myArray = {
      new String[] {"one", "two"}, // 1st row has 2 elements
      new String[] {"three", "four", "five"} // 2nd row has 3 elements
  };

  public static void main(String[] args) {

    System.out.println("pets-size " + pets.length);

    System.out.println("pets[0] " + pets[0]);
    System.out.println("pets[1] " + pets[1]);
    System.out.println("pets[2] " + pets[2]);


    table [0][0] = 10;
    table [1][1] = 20;

    System.out.println("table[0][0]= " + table[0][0]);
    System.out.println("table[1][1]= " + table[1][1]);
    System.out.println("table[2][2]= " + table[2][2]);


  }

}
