package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class RunningCoach implements Coach {

	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	// define a default constructor
	public RunningCoach() {
		System.out.println(">> inside default constructor of RunningCoach");
	}
	
	
	//define my init methd
	@PostConstruct
	public void doMyStastup() {
		System.out.println(">> RunningCoach: inside of doMyStartupStuff() ");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> RunningCoach: inside of doMyCleanupStuff() ");
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
