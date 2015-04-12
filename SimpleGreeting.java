// Write a program that asks the user for his name
// and greets him with his name.
import java.io.Console;

public class SimpleGreeting {
  public static void main(String []args) {
    Console cons = System.console();
    String name = cons.readLine("Oh my, have we met...?  \n");
    cons.printf("Ah! Nice to meet you %s! The pleasure is all mine.", name);
  }
}
