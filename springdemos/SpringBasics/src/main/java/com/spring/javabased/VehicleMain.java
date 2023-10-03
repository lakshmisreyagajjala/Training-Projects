package com.spring.javabased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.spring.javabased");
		Vehicle vehicle = context.getBean("getVehicle",Vehicle.class);
		System.out.println(vehicle);
		context.close();

	}

}

