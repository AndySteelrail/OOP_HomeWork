package org.home_work5.service;

import java.util.ArrayList;

public class DataStudent implements ServiceStudent{
    List<Student> listStudents = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(listStudents.size() + 1);
        listStudents.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return listStudents;
    }
}
