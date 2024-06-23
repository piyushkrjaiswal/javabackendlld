package dev.pkj.javabackendlld.designpatterns.builder;

public class StudentBuilderClient {
    public static void main(String[] args) {
//        Builder b = Student.getBuilder();
//        b.setName("Piyush");
//        b.setAdmissionYear(1990);
//        b.setEmail("piyushsince1988@hotmail.com");
//        b.setPercentage(80);
//        b.setRollNo(21);

//        Student st = new Student(b);
//        Student student = b.build();

        Student student = Student.getBuilder()
                            .setName("Nihit")
                                .setAdmissionYear(2010)
                                    .setEmail("nihit@gmail.com")
                                        .setRollNo(1)
                                            .setPercentage(95)
                                                .build();

    }
}
