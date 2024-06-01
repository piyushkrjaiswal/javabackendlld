package dev.pkj.javabackendlld.streams;

import dev.pkj.javabackendlld.lambdas.comparators.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 9, 6, 7, 34, 2 , 8, 18, 24);
        List<Integer> oddNumbers = new ArrayList<>();
        for(Integer number: numbers) {
            if(number%2 == 1) oddNumbers.add(number);
        }
        System.out.println(oddNumbers);

        // Now using streams

        List<Integer> oddNumbers1 = numbers.stream().filter((x) -> x%2 == 1).toList();
        System.out.println(oddNumbers1);

        List<Student> students = Arrays.asList(new Student("Sonu", 4, 93),
                new Student("Piyush", 1, 92),
                new Student("Monu", 2, 90),
                new Student("Tonu", 3, 91));

        System.out.println(students.stream().filter(student -> student.marks > 91).toList());
        System.out.println(students.stream().map(student -> student.marks).toList());

        List<String> words = Arrays.asList("bangalore", "Jhansi", "Delhi", "Pune", "Hyderabad");
        System.out.println(words.stream().filter(word -> word.length() > 5).toList());

        // convert list of word from lower case to upper
        List<String> uppercasewords = words.stream().map(String::toUpperCase).toList();
        System.out.println(uppercasewords);


        // flatmap


    }


}
