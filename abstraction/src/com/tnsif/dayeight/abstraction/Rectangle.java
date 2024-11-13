package com.tnsif.dayeight.abstraction;

public abstract class Rectangle {
	  private float width, height;

	    public Rectangle(float width, float height) {
	        this.width = width;
	        this.height = height;
	    }

	
	  public void calArea() {
	      float area = width * height;
	      System.out.println("Area of Rectangle: " + area);
	    }
	 public void show() {
	    System.out.println("Rectangle with width: " + width + " and height: " + height);
	    }
	}

