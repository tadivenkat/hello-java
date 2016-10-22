package org.tadivenkat;

public class HelloWorld {
   public static void main(String args[]) {
      GreetingService greetingService = new GreetingService();
      System.out.println(greetingService.greet("Amma, Naanna"));
   }
}
