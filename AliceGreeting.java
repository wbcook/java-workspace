import java.io.Console;

public class AliceGreeting {

  public static void main(String []args){

    Console cons = System.console();
    while (true) {
      String name;
      name = cons.readLine("Oh my, have we met...?  \n");
      if (name.equals("Bob")) {
        cons.printf("Ah! Nice to meet you %s! The pleasure is all mine.", name);
        break;
      } else if ( name.equals("Alice")) {
        cons.printf("Ah! Nice to meet you %s! The pleasure is all mine.", name);
        break;
      } else {
        cons.printf("%s?!  What a SILLY name you have, ho ho ho!  \n\n" , name);
      }
    }
  }
}
