// Write a program that asks the user for a number n and
// prints the sum of the numbers 1 to n
import java.io.Console;

public class PartialSum {
  public static void main(String []args) {
    int n;
    int sum = 0;
    Console cons = System.console();

    n = Integer.parseInt(cons.readLine(
    "I will sum the numbers 1 to n, please specify n:  "));
    cons.printf("##########\nYou entered:  %d\n##########", n);

    for(int i = 1; i <= n; i++) {
      sum += i;
      cons.printf("\n%d", sum);
    }
  }
}
