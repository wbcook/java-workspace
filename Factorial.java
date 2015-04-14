// Write a program that asks the user for a number n and
// prints the product of the numbers 1 to n
import java.io.Console;

public class Factorial {
  public static void main(String []args) {
    int n;
    int sum = 1;
    Console cons = System.console();

    n = Integer.parseInt(cons.readLine(
    "I will multiply the numbers 1 to n, please specify n:  "));
    cons.printf("##########\nYou entered:  %d\n##########", n);

    for(int i = 1; i <= n; i++) {
      sum *= i;
      cons.printf("\n%d", sum);
    }
  }
}
