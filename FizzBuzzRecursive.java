// Print a list of numbers from 1 to 100.
// Print FizzBuzz for numbers divisible by 3 and 5.
// Print Fizz for numbers divisible by 3, and Buzz for numbers divisible by 5.
// Print the other numbers as they would normally appear.
import java.io.Console;
import java.util.Arrays;

public class FizzBuzzRecursive {
  public static void main(String []args) {
    String[] fizzBuzzArray = new String[100];
    int range = 100;

    fizzBuzzArray = fizzBuzzArrayBuilder(fizzBuzzArray, range);

    fizzBuzzArrayPrinter(fizzBuzzArray);
  }

  public static String[] fizzBuzzArrayBuilder(String[] fizzBuzzArray, int range) {

    if (range == 0) {
      return fizzBuzzArray;
    } else {
      range -= 1;
      if (range % 15 == 0) {
        fizzBuzzArray[range] = "FizzBuzz!";
      } else if (range % 3 == 0) {
        fizzBuzzArray[range] = "Fizz";
      } else if (range % 5 == 0) {
        fizzBuzzArray[range] = "Buzz";
      } else {
        fizzBuzzArray[range] = Integer.toString(range);
      }
      return fizzBuzzArrayBuilder(fizzBuzzArray, range);
    }
  }

  public static void fizzBuzzArrayPrinter(String[] fizzBuzzArray) {
    Console cons = System.console();
    int l = fizzBuzzArray.length;
    for (int i = 0; i < l; i++) {
      cons.printf("\n%s", fizzBuzzArray[i]);
    }
  }
}
