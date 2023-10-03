package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component("shape")
public class Square implements Shape{

	@Override
	public void area(int length, int breadth) {
		
		System.out.println("Area of Square"+(length*breadth));
		
	}

}
