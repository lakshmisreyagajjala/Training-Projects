package com.spring.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Vehicle {
	
	private String model;
	private String brand;
	@Autowired
	private Engine engine;
	private double price;
	
	public String getModel() {
		return model;
	}
	@Value("A100")
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	@Value("Honda")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public double getPrice() {
		return price;
	}
	@Value("2000")
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
