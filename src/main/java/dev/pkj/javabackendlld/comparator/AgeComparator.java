package dev.pkj.javabackendlld.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return Integer.compare(s1.age, s2.age);
    }
}
