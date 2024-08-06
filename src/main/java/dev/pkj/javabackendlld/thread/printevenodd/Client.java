package dev.pkj.javabackendlld.thread.printevenodd;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);

        for(int i = 0; i < 50; i++) {
            Odd odd = new Odd(count);
            Even even = new Even(count);
            Thread t1 = new Thread(odd);
            Thread t2 = new Thread(even);
            t1.start();
//            t1.wait();
            t2.start();

            t1.join();
            t2.join();
        }

    }
}
