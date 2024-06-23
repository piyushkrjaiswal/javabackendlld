package dev.pkj.javabackendlld.designpatterns.prototype;

public class IntelligentStudent extends Student{
    int id;

    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.id = intelligentStudent.id;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
