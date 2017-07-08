package org.tadivenkat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   public static void main(String args[]) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	  GreetingService greetingService = (GreetingService) context.getBean("GreetingService");
	  System.out.println(greetingService.greet(args[0]));
   }
}