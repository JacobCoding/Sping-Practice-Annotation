package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Run 3km and then walk 2km";
	}

}
