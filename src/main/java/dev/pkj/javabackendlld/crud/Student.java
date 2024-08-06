package dev.pkj.javabackendlld.crud;

public class Student implements Comparable{
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        if(this.age > st.age) {
            return -1;
        } else if(this.age < st.age) {
            return 1;
        }

        if(this.name.charAt(0) > st.name.charAt(0)) {
            return 1;
        } else if(this.name.charAt(0) < st.name.charAt(0)) {
            return -1;
        }
        return 0;
    }

    public String toString() {

        return "name:" + this.name + " " + "age: " + this.age;

    }
}
