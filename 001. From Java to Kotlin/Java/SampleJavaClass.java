import java.awt.*;

import static java.awt.Color.*;

// Java codes in SampleJavaClass.java
public class SampleJavaClass {
  public static void main(String[] args) {

    PersonKotlin p = new PersonKotlin("Abderlahman", 25);
    System.out.println(p.component1());
    System.out.println(p.component2());
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
