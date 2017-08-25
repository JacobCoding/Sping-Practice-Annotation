package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	// define a default constructor
	public RunningCoach() {
		System.out.println(">> inside default constructor of RunningCoach");
	}
	
	
//	// define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> RunningCoach: inside setFortuneService");
//		this.fortuneService = fortuneService;
//	}

	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> RunningCoach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}

	
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
