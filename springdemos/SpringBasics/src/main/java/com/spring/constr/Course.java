package com.spring.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private String courseName;
	private double cost;
	public String getCourseName() {
		return courseName;
	}
	@Value("${student.course.courseName}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCost() {
		return cost;
	}
	@Value("${student.course.cost}")
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", cost=" + cost + "]";
	}
	
	

}
