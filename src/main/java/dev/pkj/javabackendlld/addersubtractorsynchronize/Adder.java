package dev.pkj.javabackendlld.addersubtractorsynchronize;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;


    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i =1; i<=100000; i++) {
            synchronized (Count.class) {
                count.value += 1;
            }

        }

    }
}
