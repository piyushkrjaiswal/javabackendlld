package dev.pkj.javabackendlld.designpatterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student apr2023BiginnerStudentBatch = new Student();
        apr2023BiginnerStudentBatch.setBatch("apr 2023 Biginner Student Batch");
        apr2023BiginnerStudentBatch.setAvgPsp(70.0);
        studentRegistry.register("apr23Biginner", apr2023BiginnerStudentBatch);

        IntelligentStudent apr2023IntelligentStudent = new IntelligentStudent();
        apr2023IntelligentStudent.setBatch("apr 2023 Intelligent Student");
        apr2023IntelligentStudent.setAvgPsp(70.0);
        apr2023IntelligentStudent.setId(160);
        studentRegistry.register("apr23Intelligent", apr2023IntelligentStudent);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student student = studentRegistry.get("apr23Biginner").clone();
        student.setName("Deepak");
        student.setAge(36);
        student.setCity("Bangalore");
        student.setPsp(80.9);

        Student kirthi = studentRegistry.get("apr23Intelligent").clone();
        kirthi.setName("Kirthi");
        kirthi.setAge(32);
        kirthi.setPsp(90.1);
        kirthi.setCity("Hyderabad");

        System.out.println("DEBUG");

    }
}
