package com.spring.springCore.annotaion;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Tennis implements SportInterface{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I am Tennis");
	}

	@Override
	public void getPerson() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void init() {
		System.out.println("inside init method");
	}


	@Override
	public void preDestroy() {
		// TODO Auto-generated method stub
		System.out.println("inside pre destory method");
	}

}
