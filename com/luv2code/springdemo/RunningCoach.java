package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		
		return "Run 3km and then walk 2km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
