// Print a list of numbers from 1 to 100.
// Print FizzBuzz for numbers divisible by 3 and 5.
// Print Fizz for numbers divisible by 3, and Buzz for numbers divisible by 5.
// Print the other numbers as they would normally appear.
import java.io.Console;

public class FizzBuzz {
  public static void main(String []args) {
    printFizzBuzz();
  }

  public static void printFizzBuzz() {
    Console cons = System.console();
    int range = 100;
    for (int i = 1; i <= 100; i++) {
      if (i % 15 == 0) {
        cons.printf("\nFizzBuzz!");
      } else if ( i % 3 == 0) {
        cons.printf("\nFizz");
      } else if ( i % 5 == 0) {
        cons.printf("\nBuzz");
      } else {
        cons.printf("\n%s", i);
      }
    }
  }
}
