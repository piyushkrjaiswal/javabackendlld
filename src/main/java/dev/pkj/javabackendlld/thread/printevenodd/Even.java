package dev.pkj.javabackendlld.thread.printevenodd;

public class Even implements Runnable {
    Count count;

    public Even(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.value += 1;
        System.out.println(count.value);
    }
}
