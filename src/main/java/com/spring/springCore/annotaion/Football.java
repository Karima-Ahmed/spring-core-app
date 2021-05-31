package com.spring.springCore.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Football implements SportInterface{

	@Autowired
	private PersonInterface person; 
	
	@Value("${user.name}")
	private String name;
	
	@Value("${user.email}")
	private String email;

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I am Football");
	}


	@Override
	public void getPerson() {
		 this.person.start();
	}


	public void setPerson(PersonInterface person) {
		this.person = person;
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
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


}
