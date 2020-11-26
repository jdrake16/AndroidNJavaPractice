package edu.cnm.deepdive;

public class NumberShapes {

  public static void main(String[] args) {


    class Number {

      int numb;

      public boolean isSquare() {

        double squareRoot = Math.sqrt(numb);

        if (squareRoot == Math.floor(squareRoot)) {

          return true;

        } else {

          return false;
        }

      }

      public boolean isTriangular() {

        int x = 1;

        int triNum = 1;

        while (triNum < numb) {

          x++;

          triNum = triNum + x;
        }

        if (triNum == numb) {
          return true;
        } else {
          return false;
        }
      }
    }

    Number myNumb = new Number();

    myNumb.numb = 5;

    System.out.println(myNumb.isTriangular());


  }

}
