package dev.pkj.javabackendlld.immutable;

public class StudentClient {
    public static void main(String[] args) {

        Student student = new Student("Piyush", "12/04/1988", "jhansi");
        System.out.println(student.getName());
        System.out.println(student.getDob());
        System.out.println(student.getCity());
        System.out.println();
        Student student1 = new Student("Piyush1", "12/04/1989", "jhansii");
        System.out.println(student.getName());
        System.out.println(student.getDob());
        System.out.println(student.getCity());




    }
}
