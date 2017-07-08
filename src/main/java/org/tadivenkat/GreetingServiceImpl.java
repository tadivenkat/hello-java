package org.tadivenkat;

public class GreetingServiceImpl implements GreetingService {
   public String greet(String message) {
      return "Hello " + message;
   }
}
