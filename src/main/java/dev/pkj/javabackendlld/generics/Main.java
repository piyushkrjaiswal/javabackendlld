package dev.pkj.javabackendlld.generics;

public class Main {
    public static void main(String[] args) {
//        Pair pair = new Pair();
//        pair.first = 65.93845;
//        pair.second = "45.67453";
//
//        double x = (Double) pair.first;
//        double y = (Double) pair.second;
        Pair<String, Integer> p1 = new Pair<>();

        p1.first = "Scaler";
        p1.second = 1234;

        Pair<Double, Double> p2 = new Pair<>();
        p2.first = 45.2345;
        p2.second = 23.567;



    }
}
