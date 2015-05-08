// Write a function that returns the largest element in a list.
import java.io.Console;
import java.util.Arrays;

public class LargestElement {
  public static void main(String []args) {
    Console cons = System.console();

    int[] listOfInts = {1, 3, 4, 5, 2};
    String numbers = Arrays.toString(listOfInts);

    int largestInt = 0;
    largestInt = returnLargestInt(listOfInts);
    cons.printf("The largest int of %s is:  %d\n", numbers, largestInt);
  }

  public static int returnLargestInt(int[] listOfInts) {
    int largestInt = 0;
    int l = listOfInts.length;

    for (int i = 0; i < l; i++) {
      if (listOfInts[i] > largestInt) {
        largestInt = listOfInts[i];
      }
    }
    return largestInt;
  }
}
