package dev.pkj.javabackendlld.abstraction;

abstract class Shape {
    String color;

    abstract double area();
    public abstract String toString();


    public Shape(String Color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
