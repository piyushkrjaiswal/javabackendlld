package dev.pkj.javabackendlld.uniqueCharacters;

public class Client {
    public static void main(String[] args) {
//
        int a = 10;
        int b = 20;
       TwoNumber tnum = new TwoNumber() {
           @Override
           public int sum(int a, int b) {
               return a+b;
           }
       };

        System.out.println(tnum.sum(a, b));



    }
}
