package com.spring.springCore.annotaion;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable
@ComponentScan("com.spring.springCore.annotaion")
@PropertySource("properties.properties")
public class SpringConfiguration {


	@Bean
	public Master getMaster() {
		return new Master(getUser());
	}
	
	@Bean
	public Admin getUser() {
		return new Admin();
	}
}
