package dev.pkj.javabackendlld.abstraction;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;

    }

    @Override
    public String toString() {
        return "Color of rectagle is " + super.getColor() + " and Area is " + area();
    }

}
