package dev.pkj.javabackendlld.strings;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        String s1 = "java"; // java string literals
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch); //converting character array to string
        String s3 = new String("example"); // creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String str1 = "Hello world";
        String str2 = "Hello world";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String a = "Hi";
        System.out.println(a.length());

        String b = "hi";
        System.out.println(a.equalsIgnoreCase(b));

        String c = "Pi";
        System.out.println(a.compareTo(b)); // compare value lexicographically
        System.out.println(a.compareTo(c));




    }
}
