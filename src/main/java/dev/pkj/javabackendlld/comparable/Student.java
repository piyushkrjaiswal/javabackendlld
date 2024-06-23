package dev.pkj.javabackendlld.comparable;

public class Student implements Comparable{
    public String name;
    public int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        if(this.age == st.age) {
            return 0;
        } else if(this.age > st.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
