package com.spring.setter;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring");
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
		
		Employee employee1 = (Employee)context.getBean("employee",Employee.class);
		System.out.println(employee1);
		
		Employee employee2 = (Employee)context.getBean(Employee.class);
		System.out.println(employee2);
		
		

	}

}

