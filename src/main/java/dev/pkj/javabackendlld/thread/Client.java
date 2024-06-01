package dev.pkj.javabackendlld.thread;

public class Client {
    public static void main(String[] args) {
//        System.out.println("Hello World, Printed by " + Thread.currentThread().getName());
//        HelloWorldPrinter h = new HelloWorldPrinter();
//        Thread t = new Thread(h);
//        t.start();
//        System.out.println("Hello World, Printed by " + Thread.currentThread().getName());
//
//
//        System.out.println("I am the main class");
//        Adder ad = new Adder();
//        Thread t1 = new Thread(ad);
//        t1.start();
//
//        Subtractor sb = new Subtractor();
//        Thread t2 = new Thread(sb);
//        t2.start();

        for(int i = 1; i<=100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread t3 = new Thread(np);
            t3.start();
        }


    }
}

