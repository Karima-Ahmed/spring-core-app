package com.spring.springCore.xml;

public class Volleyball implements SportInterface {

	@Override
	public void start() {
		System.out.println("I am Volleyball");
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
