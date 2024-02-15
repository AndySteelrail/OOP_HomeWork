package org.home_work5.view;

import org.home_work5.model.Student;
import org.home_work5.model.Teacher;
import java.util.List;


public class TeacherView {
    public void printListTeachers(List<Teacher> listTeachers) {
        System.out.println("All teachers: ");
        for (Teacher teacher : listTeachers) {
            System.out.println(teacher);
        }
        System.out.println();
    }
}
