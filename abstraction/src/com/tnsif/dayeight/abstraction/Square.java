package com.tnsif.dayeight.abstraction;

public abstract class Square extends Shape {
	private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void calArea() {
        float area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void show() {
        System.out.println("Square with side: " + side);
    }
}