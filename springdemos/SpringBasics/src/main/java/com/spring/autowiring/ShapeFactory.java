package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	
	@Autowired
	@Qualifier("rectangle") //shape = new Rectangle() by type
	Shape nshape;
	
	@Autowired
	Shape shape; //shape = new Square() autowiring by name
	
	//autowiring by constr
//	Shape tshape;
//	public ShapeFactory(Shape myshape) {
//		super();
//		this.tshape = myshape;
//	}
	
	public void printArea(int length, int breadth) {
		System.out.println("print...");
		nshape.area(length,breadth); //rectangle
		shape.area(length,breadth);  //by name
//		tshape.area(length,breadth); //by constr
	}
}




