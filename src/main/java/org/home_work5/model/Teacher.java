package org.home_work5.model;


public class Teacher extends User {
    private int teacherId;
    private final String subject;

    public Teacher (int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "teacherId = " + teacherId +
                ", subject = '" + subject + '\'' +
                ", age = " + age +
                ", name = '" + name + '\'' +
                "}";
    }
}
