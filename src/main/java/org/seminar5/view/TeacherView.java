package org.seminar5.view;

import org.seminar5.model.Teacher;

import java.util.List;

public class TeacherView {
    public void printListTeachers(List<Teacher> listTeachers) {
        System.out.println("Все учителя: \n" + listTeachers);
    }
}