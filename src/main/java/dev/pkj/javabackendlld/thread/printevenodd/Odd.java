package dev.pkj.javabackendlld.thread.printevenodd;

public class Odd implements Runnable{
    Count count;
    public Odd(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        count.value += 1;
        System.out.println(count.value);

    }
}
