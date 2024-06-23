package dev.pkj.javabackendlld.polymorphism;

public class RunTimePolymorphismClient {
    public static void main(String[] args) {
        RunTimeParentPolymorphism a;
        a = new RunTimeParentPolymorphism();
        a.Print();

        a = new RunTimeChildPolymorphism();
        a.Print();

    }
}
