package org.home_work5.model;


public class Student extends User{
    private int studentId;
    private final double averageMark;

    public Student (int age, String name, double average) {
        super(age, name);
        this.averageMark = average;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student {" +
                "studentId = " + studentId +
                ", average = " + averageMark +
                ", age = " + age +
                ", name = '" + name + '\'' +
                "}";
    }
}
