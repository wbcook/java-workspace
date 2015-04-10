// Write a program that asks the user for his name
// and greets him with his name.
import java.io.Console;

public class SimpleGreeting {
  public static void main(String []args) {
    Console cons = System.console();
    String name = cons.readLine("What is your name:  ");
    cons.printf("Hello, %s!\n", name);
  }
}
