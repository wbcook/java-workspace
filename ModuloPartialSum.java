// Write a program that asks the user for a number n and
// prints the sum of the numbers 1 to n
import java.io.Console;

public class ModuloPartialSum {
  public static void main(String []args) {
    int n;
    int sum = 0;
    Console cons = System.console();

    n = Integer.parseInt(cons.readLine(
    "I will sum the numbers 1 to n, please specify n:  "));
    cons.printf("##########\nYou entered:  %d\n##########\n", n);

    for(int i = 1; i <= n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
        cons.printf("%d\n", sum);
      } else {
        cons.printf("Modulo!\n");
      }
    }
  }
}
