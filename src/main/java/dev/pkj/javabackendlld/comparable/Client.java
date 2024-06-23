package dev.pkj.javabackendlld.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student("Piyush", 36);
        Student s2 = new Student("Mahek", 30);

        ArrayList al = new ArrayList<>();
        al.add(s1);
        al.add(s2);

        Collections.sort(al);
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            Student s = (Student) itr.next();
            System.out.println(s.name + " " + s.age);
        }
    }
}
