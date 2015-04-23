// Write a program to print a multiplication table of the numbers up to 12.

public class MultiplicationTable {
  public static void main(String []args) {
    for (int a = 1; a <= 12; a++) {
      for (int b = 1; b <= 12; b++) {
        System.out.format("%4d",a*b);
      }
      System.out.println();
    }
  }
}
