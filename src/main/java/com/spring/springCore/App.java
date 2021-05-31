package com.spring.springCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springCore.annotaion.Football;
import com.spring.springCore.annotaion.Master;
import com.spring.springCore.annotaion.SportInterface;
import com.spring.springCore.annotaion.SpringConfiguration;

public class App {
	public static void main(String[] args) {
		// java code
		/*
		 * Sport sport = new Football(); sport.start();
		 */

		// get bean from spring container by xml configuration
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container by annotation
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	
		
		//test singlton scope
		SportInterface sport = context.getBean("football", SportInterface.class);
		sport.start();
		sport.getPerson();

		SportInterface sport2 = context.getBean("football", SportInterface.class);
		sport2.start();
		System.out.print("is singlton scope: ");
		System.out.println(sport == sport2);
		//end test singlton scope

		// test prototype scope
		SportInterface tennis1 = context.getBean("tennis", SportInterface.class);
		tennis1.start();
		
		SportInterface tennis2 = context.getBean("tennis", SportInterface.class);
		tennis2.start();
		System.out.print("is singlton scope: ");
		System.out.println(tennis1 == tennis2);
		//end test prototype scope
		
	
		//read from property file
		Football football = context.getBean("football", Football.class);
		System.out.println(football.getName());
		System.out.println(football.getEmail());
		//end read from property file

		
		
		// test @Bean registerd in container without annotation @Component
		Master master = context.getBean("getMaster", Master.class);
		master.start();
		master.getAdmin().start();
		// end test @Bean registerd in container without annotation @Component
		
		// close context
		context.close();

	}
}
