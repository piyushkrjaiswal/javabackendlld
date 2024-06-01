package dev.pkj.javabackendlld.staticmethod;

public class Main {
    void hello() {
        System.out.println("This is a non-static method");
    }

    static void print() {
//        hello(); // non-static method cannot be referenced from static context
    }

    public static void main(String[] args) {
        Main.print();
    }


}
