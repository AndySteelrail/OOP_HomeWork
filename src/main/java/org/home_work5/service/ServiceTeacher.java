package org.home_work5.service;

import org.seminar5.model.Teacher;
import org.seminar5.model.User;

import java.util.List;

public interface ServiceTeacher {
    Teacher create(User user);
    List<Teacher> read();
}
