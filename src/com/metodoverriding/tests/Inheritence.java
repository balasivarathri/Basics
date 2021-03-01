package com.metodoverriding.tests;

public class Inheritence extends ChildClass{

	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();//Static polymorphism or compiletime polymorphism
		c.div();
		c.mul();
	
		
		System.out.println("***************");
		
		ParentClass p = new ParentClass();
		p.add();
		p.sub();
		
		
		System.out.println("***************");
		
	
		
	}
}
