package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean //spring creates the bean for this class
	public Vehicle getVehicle() {
		return new Vehicle();
	}
	@Bean
	public Engine getEngine() {
		return new Engine();
	}

}
