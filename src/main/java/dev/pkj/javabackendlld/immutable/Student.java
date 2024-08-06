package dev.pkj.javabackendlld.immutable;

public class Student {
    private final String name;
    private final String dob;

    private final String city;

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getCity() {
        return city;
    }

    public Student(String name, String dob, String city) {
        this.name = name;
        this.dob = dob;
        this.city = city;
    }
}
