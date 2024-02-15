package org.home_work5.service;

import org.seminar5.model.Student;
import org.seminar5.model.User;

import java.util.List;

public interface ServiceStudent {
    Student create(User user);
    List<Student> read();
}
