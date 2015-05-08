// Check if integer p is a prime number or not.
import java.io.Console;

public class PrimeNumbers {
  public static void main(String []args) {

    Console cons = System.console();
    int p;
    boolean flag = false;

    p = Integer.parseInt(cons.readLine("is prime  "));

    for (int i = 2; i < p; i++) {
      if ( p % i == 0) {
        cons.printf("%d divisible by %d\n", p, i);
        cons.printf("%d is not a prime number\n", p);
        flag = false;
        break;
      }
      flag = true;
    }

    if (flag) {
      cons.printf("%d is a prime number\n", p);
    }

  }
}
