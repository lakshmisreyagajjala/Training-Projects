package com.spring.autowiring;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.autowiring");
		ShapeFactory factory = context.getBean("shapeFactory",ShapeFactory.class);
		factory.printArea(10, 20);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		

	}

}
