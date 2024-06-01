package dev.pkj.javabackendlld.lambdas.runnables;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World printed by " + Thread.currentThread().getName());
        Runnable runnable = () -> System.out.println("Hello World printed by " + Thread.currentThread().getName());
        Thread t = new Thread(runnable);
        t.start();

        Thread t1 = new Thread(
                () -> System.out.println("Hello World printed by " + Thread.currentThread().getName())
        );

        t1.start();
    }
}
