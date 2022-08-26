package fromJavatoKotlin;

// packege name then file name
import bsics.MainClass;
import fromjavatoKotlin.PersonKotlin;

// or we can use import static
// import static fromjavatoKotlin.PersonKotlin.*;

import java.awt.*;

import static java.awt.Color.*;

// Java codes in fromJavatoKotlin.SampleJavaClass.java
public class SampleJavaClass {
  public static void main(String[] args) {

    PersonKotlin p = new PersonKotlin("Abderlahman", 25);
    System.out.println(p.component1());
    System.out.println(p.component2());

    // we changed the name of MainKotlin in the bsics backege to MainClass and we called it
    MainClass.foo();

  }


  public static int rectangleArea(int x, int y) {
    return x * y;
  }

  public static void updateWeatherJava(int degree) {
    String descraption;
    Color color;

    if (degree < 10) {
      descraption = "cold";
      color = BLUE;
    } else if (degree < 25) {
      descraption = "mild";
      color = ORANGE;
    } else {
      descraption = "hot";
      color = RED;
    }
    System.out.println("descraption weather is: " + descraption + "\nColor is: " + color);
  }
}
