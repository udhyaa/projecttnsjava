package com.tnsif.dayeight.abstraction;

public abstract class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Rectangle rect = new Rectangle(10,20);
	 Square sq = new Square(12.5f);

	        rect.calArea();
	        rect.show();

	        System.out.println();

	       
	        sq.calArea();
	        sq.show();
	        
	        System.out.println();

	        Shape shape;
	        shape = new Square(15.0f);
	        
	        shape.calArea();
	        shape.show();

	        System.out.println();

	        shape = new Rectangle(8.0f,6.0f);
	        shape.calArea();
	        shape.show();
	    }
	}