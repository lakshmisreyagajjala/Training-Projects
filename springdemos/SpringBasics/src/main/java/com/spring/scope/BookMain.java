package com.spring.scope;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.setter.Employee;

public class BookMain {

	public static void main(String[] args) {
		
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.scope");
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		Book book = (Book)context.getBean("book");
		System.out.println(book);
		
		Book book1 = context.getBean("book",Book.class);
		System.out.println("Book1 "+book1.getTitle());
		
		Book book2 = context.getBean("book",Book.class);
		System.out.println("Book2 "+book2.getTitle());
		
		book2.setTitle("Angular");
		System.out.println("Book1 "+book1.getTitle());
		System.out.println("Book2 "+book2.getTitle());
	}

}

