package dev.pkj.javabackendlld.interfaceimpl;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rectangle = new Rectangle(20, 10);

        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Rectangle area is " + rectangle.calculateArea());
    }
}
