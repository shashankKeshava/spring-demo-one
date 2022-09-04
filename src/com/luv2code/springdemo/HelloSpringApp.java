package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	
	// Load the spring configuration file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	// retrieve bean from spring container
	Coach theCoach = context.getBean("myCoach",Coach.class);
	
	// call methods on the bean
	System.out.println(theCoach.getDailyWorkout());
	
	// lets call the fortune service
	System.out.println(theCoach.getDailyFortune());
		
	// Close the context
	context.close();

	}

}
