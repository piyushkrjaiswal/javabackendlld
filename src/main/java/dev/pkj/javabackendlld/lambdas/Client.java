package dev.pkj.javabackendlld.lambdas;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args) {
//        SampleFunctionalInterface sm = new SampleFunctionalInterface();
        // Way - 1
        SampleClass sc = new SampleClass();
        sc.fun1();

        // Way - 2 Anonymous Class
        SampleFunctionalInterface obj = new SampleFunctionalInterface() {
            @Override
            public void fun1() {
                System.out.println("Anonymous Class");
            }
        };

        obj.fun1();

        BiConsumer<String, Integer> bi = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer i) {
                System.out.println("String " + s + " Integer " + i);
            }
        };

        bi.accept("Piyush", 3542);

        // way - 3 Lambda Expression
        Consumer<String> consumer = (x) -> {
            System.out.println("Consumer lambda implementation + " + x);
        };

        consumer.accept("Deepak");

        BiConsumer<String, Integer> biConsumer = (x, y) -> {
            System.out.println(x + " " + y);
        };

        biConsumer.accept("Biconsumer", 2);

        BinaryOperator<Integer> biop = (x, y) -> {
            return x + y;
        };

        System.out.println(biop.apply(10, 20));

        Predicate<String> p = (str) -> str.length() > 10;

        System.out.println(p.test("Scaler Academy"));

    }
}
