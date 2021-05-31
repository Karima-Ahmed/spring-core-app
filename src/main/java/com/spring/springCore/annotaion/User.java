package com.spring.springCore.annotaion;

import org.springframework.stereotype.Component;

@Component
public class User implements PersonInterface{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I am user");
	}

}
