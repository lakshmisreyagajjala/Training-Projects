package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area(int length, int breadth) {
		
		System.out.println("Area of Triangle"+(0.5*length*breadth));
		
	}

}
