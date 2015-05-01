// Check if integer p is a prime number or not.
// Integer.MAX_VALUE =  2147483647
// Long.MAX_VALUE =  9223372036854775807
import java.io.Console;

public class AllPrimeNumbers {
  public static void main(String []arges) {

    Console cons = System.console();
    int maxValue = Integer.MAX_VALUE;
    //int p = 1;

    //p = Integer.parseInt(cons.readLine("is prime  "));

    for (int p = 2; p < maxValue; p++) {

      isPrime(p, cons);
    }
  }

  public static boolean isPrime(int p, Console cons) {
    boolean flag = false;

    for (int i = 2; i < p; i++) {
      if ( p % i == 0) {
        //cons.printf("%d divisible by %d\n", p, i);
        //cons.printf("%d is not a prime number\n", p);
        flag = false;
        break;
      }
      flag = true;
    }

    if (flag) {
      cons.printf("%d is a prime number\n", p);
    }

    return flag;
  }

}
