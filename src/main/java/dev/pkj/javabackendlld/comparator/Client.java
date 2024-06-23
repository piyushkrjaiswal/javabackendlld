package dev.pkj.javabackendlld.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student("Piyush", 30);
        Student s2 = new Student("Mahek", 36);
        ArrayList al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
//         name comparator
        System.out.println("Sort by Name:");
        Collections.sort(al, new NameComparator());
        Iterator it = al.iterator();
        while(it.hasNext()) {
            Student st = (Student) it.next();
            System.out.println(st.name + " " + st.age);
        }

        System.out.println("Sort By Age");
        Collections.sort(al, new AgeComparator());
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.name + " " + st.age);
        }


    }
}
