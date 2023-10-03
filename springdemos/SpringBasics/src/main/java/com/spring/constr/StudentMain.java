package com.spring.constr;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.constr.Student;

public class StudentMain {

	public static void main(String[] args) {
		
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring");
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		Student student = (Student)context.getBean("student");
		System.out.println(student);
		
		Student student1 = context.getBean("student",Student.class);
		System.out.println(student1);
		
		Student student2 = context.getBean(Student.class);
		System.out.println(student2);

	}

}


