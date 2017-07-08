package org.tadivenkat;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class HelloWorldTest {
   private GreetingService greetingService;

   @Before
   public void setup() {
      greetingService = new GreetingServiceImpl();
   }

   @Test
   public void testGreet() {
      Assert.assertEquals("Hello Amma, Naanna", greetingService.greet("Amma, Naanna"));
   }

}
