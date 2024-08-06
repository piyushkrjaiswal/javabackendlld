package dev.pkj.javabackendlld.crud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    private List<Student> ls = new ArrayList<>();

    public void save(Student st) {
        ls.add(st);

        return;
    }

    public Student getFirstStudent() {
        Collections.sort(ls);
        return ls.get(0);
    }
}
