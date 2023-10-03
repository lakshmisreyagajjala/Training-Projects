package com.spring.javabased;

import org.springframework.beans.factory.annotation.Value;


public class Engine {
	
	private String type;
	private String mileage;
	
	public String getType() {
		return type;
	}
	@Value("V8")
	public void setType(String type) {
		this.type = type;
	}
	public String getMileage() {
		return mileage;
	}
	@Value("10km/hr")
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return "Engine [type=" + type + ", mileage=" + mileage + "]";
	}
	

}
