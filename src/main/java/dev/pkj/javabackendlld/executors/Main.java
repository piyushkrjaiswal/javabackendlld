package dev.pkj.javabackendlld.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i < 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            executorService.execute(np);
        }
        System.out.println("Cached thread pool");
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 101; i <= 200; i++) {
            NumberPrinter np1 = new NumberPrinter(i);
            executorService.execute(np1);
        }
    }
}
