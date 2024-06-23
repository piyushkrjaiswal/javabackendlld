package dev.pkj.javabackendlld.designpatterns.builder;

public class Student {
    String name;
    int rollNo;
    String email;
    int percentage;
    int admissionYear;

   private Student(Builder bldr) {
        if(bldr.getAdmissionYear() < 1990) {
            throw new RuntimeException("Year must greater than 1990");
        }
        this.name = bldr.name;
        this.admissionYear = bldr.admissionYear;
        this.email = bldr.email;
        this.rollNo = bldr.rollNo;
        this.percentage = bldr.percentage;
   }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        String name;
        int rollNo;
        String email;
        int percentage;

        int admissionYear;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getRollNo() {
            return rollNo;
        }

        public Builder setRollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getPercentage() {
            return percentage;
        }

        public Builder setPercentage(int percentage) {
            this.percentage = percentage;
            return this;
        }

        public int getAdmissionYear() {
            return admissionYear;
        }

        public Builder setAdmissionYear(int admissionYear) {
            this.admissionYear = admissionYear;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }


}
