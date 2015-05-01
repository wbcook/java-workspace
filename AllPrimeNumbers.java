// Check if integer p is a prime number or not.
// Integer.MAX_VALUE =  2147483647
// Long.MAX_VALUE =  9223372036854775807
import java.io.Console;

public class AllPrimeNumbers {
  public static void main(String []arges) {

    Console cons = System.console();
    int maxValue = 10000000;//Integer.MAX_VALUE;
    //int p = 1;

    //p = Integer.parseInt(cons.readLine("is prime  "));

    for (int p = 3; p < maxValue; p++) {

      if (isPrime(p)) {
        cons.printf("%d\n", p);
      }
    }
  }

  public static boolean isPrime(int p) {

    for (int i = 2; i < p; i++) {
      if ( p % i == 0) {
        return false;
      }
    }
    return true;
  }

}
