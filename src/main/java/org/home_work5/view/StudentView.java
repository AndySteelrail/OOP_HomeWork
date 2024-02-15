package org.home_work5.view;

import org.home_work5.model.Student;
import java.util.List;


public class StudentView {
    public void printListStudents(List<Student> listStudents) {
        System.out.println("All students: ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        System.out.println();
    }
}
