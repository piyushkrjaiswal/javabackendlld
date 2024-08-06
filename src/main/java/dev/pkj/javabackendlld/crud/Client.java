package dev.pkj.javabackendlld.crud;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("Piyush", 36);
        Student st1 = new Student("Rahul", 39);
        Student st2 = new Student("Aditya", 39);

        StudentManager sm = new StudentManager();
        sm.save(st);
        sm.save(st1);
        sm.save(st2);

        Student stResponse = sm.getFirstStudent();
        System.out.println(stResponse.toString());


    }
}
