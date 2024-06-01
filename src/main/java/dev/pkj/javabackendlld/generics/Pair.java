package dev.pkj.javabackendlld.generics;

public class Pair<A, B> {
    A first;
    B second;

    void setFirst(A first) {
        this.first = first;
    }

    void setSecond(B second) {
        this.second = second;
    }
}
