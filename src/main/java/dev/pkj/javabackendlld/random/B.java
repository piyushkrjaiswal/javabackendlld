package dev.pkj.javabackendlld.random;

public class B extends A{
    private String a = "Romi";

    public static void main(String[] args) {
        A ob = new B();
        System.out.println(((B) ob).a);
    }
}
