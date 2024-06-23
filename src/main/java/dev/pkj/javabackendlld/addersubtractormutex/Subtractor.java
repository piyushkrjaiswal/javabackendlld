package dev.pkj.javabackendlld.addersubtractormutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Lock lock;
    Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 100000; i++) {
            lock.lock();
            count.value -= 1;
            lock.unlock();
        }

    }
}
