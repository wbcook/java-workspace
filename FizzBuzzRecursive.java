// Print a list of numbers from 1 to 100.
// Print FizzBuzz for numbers divisible by 3 and 5.
// Print Fizz for numbers divisible by 3, and Buzz for numbers divisible by 5.
// Print the other numbers as they would normally appear.
import java.io.Console;
import java.util.Arrays;

public class FizzBuzzArray {
  public static void main(String []args) {
    String[] fizzBuzzArray = new String[100];
    int range = 100;

    fizzBuzzArray = fizzBuzzArrayBuilder(fizzBuzzArray, range);

    fizzBuzzArrayPrinter(fizzBuzzArray);
  }

  public static String[] fizzBuzzArrayBuilder(String[] fizzBuzzArray, int range) {
    int range = 100;
    for (int i = 1; i <= range; i++) {
      int n = i-1;
      if (i % 15 == 0) {
        fizzBuzzArray[n] = "FizzBuzz!";
      } else if ( i % 3 == 0) {
        fizzBuzzArray[n] = "Fizz";
      } else if ( i % 5 == 0) {
        fizzBuzzArray[n] = "Buzz";
      } else {
        fizzBuzzArray[n] = Integer.toString(i);
      }
    }
    return fizzBuzzArray;
  }

  public static void fizzBuzzArrayPrinter(String[] fizzBuzzArray) {
    Console cons = System.console();
    int l = fizzBuzzArray.length;
    for (int i = 0; i < l; i++) {
      cons.printf("\n%s", fizzBuzzArray[i]);
    }
  }
}
