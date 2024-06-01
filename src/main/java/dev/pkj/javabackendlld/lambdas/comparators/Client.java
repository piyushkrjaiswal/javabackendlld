package dev.pkj.javabackendlld.lambdas.comparators;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Sonu", 4, 93),
        new Student("Piyush", 1, 92),
        new Student("Monu", 2, 90),
        new Student("Tonu", 3, 91));
        Comparator<Student> marksComparison = (s1, s2) -> s1.marks - s2.marks;
        Collections.sort(students, marksComparison);
        System.out.println(students);

    }


}
