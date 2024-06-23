package dev.pkj.javabackendlld.polymorphism;

public class CompileTimePolymorphism {
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}
