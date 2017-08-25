package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		//Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach1 = context.getBean("swimCoach", Coach.class);
		
		//call a method on the bean
		//System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach1.getDailyWorkout());

		// call method to get the daily fortune
		//System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach1.getDailyFortune());
		
		
		//close the context
		context.close();
		
		
		

	}

}
