package dev.pkj.javabackendlld.lambdas.comparators;

public class Student {
    public String name;
    public int rollno;

    public int marks;

    public Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "[ Name: " + this.name + "RollNo: " + this.rollno + "marks: " + this.marks + "]\n";
    }
}
