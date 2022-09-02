package controlStructures;


import java.io.IOException;

import static controlStructures.ExceptionsKt.bar;
import static controlStructures.ExceptionsKt.foo;

public class Main {
  enum Color {
    RED,
    ORANGE,
    BLUE
  }

  public static void main(String[] args) {

    getDescription(Color.RED);

    try{
      // bar(); will compile
      bar();
      // foo(); won't compile
    }catch (IOException e){
      System.out.println("test");
    }
  }

  public static void getDescription(Color color) {
    switch (color) {
      case BLUE:
        System.out.println("Cold");
        break;
      case ORANGE:
        System.out.println("mild");
        break;
      case RED:
        System.out.println("Hot");
        break;
    }
  }
}


