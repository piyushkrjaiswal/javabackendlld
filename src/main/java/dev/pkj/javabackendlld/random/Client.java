package dev.pkj.javabackendlld.random;

import dev.pkj.javabackendlld.diamondproblem.A;
import dev.pkj.javabackendlld.diamondproblem.B;

import java.util.HashSet;
import java.util.TreeSet;

public class Client extends Parent {
    protected void print(){
        System.out.println("Hello B");
    }
    public static void main(String[] args) {
//       HashSet<String> set=new HashSet<String>();
//        set.add("A");
//        set.add(null);
//        set.add("B");
//        System.out.println(("size "+set.size()));

        // ClassCastException
        Client b= (Client) new Parent();
        b.print();
    }
}
