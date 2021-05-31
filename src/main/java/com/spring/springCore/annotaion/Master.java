package com.spring.springCore.annotaion;



public class Master {
	
	private Admin admin;
	
	Master(){
		
	}
	
	Master(Admin admin){
		this.admin = admin;
	}
	
	public void start() {
		System.out.println("I am Master");
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	
	
}
