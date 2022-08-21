package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create object
//		Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use object
		System.out.println(theCoach.getDailyWorkout());


	}

}
