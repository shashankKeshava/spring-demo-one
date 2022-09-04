package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// Define a private field for the interface
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Get 30 mins of daily practice";
	}

	@Override
	public String getDailyFortune() {
		// use  my fortuneService to get fortune
		return fortuneService.getFortune();
	}
}
