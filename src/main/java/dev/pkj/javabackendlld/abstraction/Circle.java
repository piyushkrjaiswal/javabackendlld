package dev.pkj.javabackendlld.abstraction;

class Circle extends Shape{
    double radius;

    public Circle (String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle color is: " + super.getColor() + " area is " + area();
    }
}
