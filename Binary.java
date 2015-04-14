// Print a binary to decimal conversion tool for an octect.
// For example the octect list 11000000 10000000 00000001 00000011 would be
// the decimal 192.128.1.3 which is handy for networking.
import java.io.Console;
import java.lang.Math;

public class Binary {
  public static void main(String []args) {
    Console cons = System.console();
    Double result = new Double("0.00");
    cons.printf("#####Binary Conversion Tool#####\n");
    for (int e = 0; e < 9; e++) {
      cons.printf("Binary place %s = %s Decimal\n", e, result.intValue());
      result = Math.pow(2, e);
    }
    cons.printf("################################\n");
  }
}
