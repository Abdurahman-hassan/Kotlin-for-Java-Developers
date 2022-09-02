package Extensions;
import static Extensions.MainKt.lastChar;
import static Extensions.MainKt.repeat;

public class main {
  public static void main(String[] args) {
    //
    char c = lastChar("cce");
    System.out.println(c);

    String s = repeat("hello",4);
    System.out.println(s);
  }
}
