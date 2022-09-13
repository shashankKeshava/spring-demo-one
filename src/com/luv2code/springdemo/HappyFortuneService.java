package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
	
	private String[] Fortunes= {"won","loss","draw"};
	
	private int Random=(int)(Math.random()*(3-0))+0;

	@Override
	public String getFortune() {
		return Fortunes[Random];
	}

}
