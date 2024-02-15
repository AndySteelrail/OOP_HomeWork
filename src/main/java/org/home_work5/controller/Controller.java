package org.home_work5.controller;

import org.seminar5.model.Student;
import org.seminar5.model.Teacher;
import org.seminar5.model.User;
import org.seminar5.service.DataStudent;
import org.seminar5.service.DataTeacher;
import org.seminar5.view.StudentView;
import org.seminar5.view.TeacherView;

import java.util.List;

public class Controller {
    private final DataStudent dataStudent;
    private final DataTeacher dataTeacher;
    private final StudentView studentView;
    private final TeacherView teacherView;

    public void start() {
        User u1 = new Student(21, "Юрий", 4.5);
        User u2 = new Teacher(45, "Василий", "Math");
        User u3 = new Student(22, "Андрей", 4.5);
        createStudent(u1);
        createTeacher(u2);
        createStudent(u3);
        List<Student> studentList = dataStudent.read();
        List<Teacher> teacherList = dataTeacher.read();
        studentView.printListStudents(studentList);
        teacherView.printListTeachers(teacherList);
    }

    public Student createStudent(User user) {
        return dataStudent.create(user);
    }

    public Teacher createTeacher(User teacher) {
        return dataTeacher.create(teacher);
    }

    public Controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        studentView = new StudentView();
        teacherView = new TeacherView();
    }
}
