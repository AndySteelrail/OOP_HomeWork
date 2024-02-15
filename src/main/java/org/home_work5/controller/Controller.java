package org.home_work5.controller;

import org.home_work5.model.StudyGroup;
import org.home_work5.service.DataStudyGroup;
import org.home_work5.view.StudyGroupView;
import org.home_work5.model.Student;
import org.home_work5.model.Teacher;
import org.home_work5.model.User;
import org.home_work5.service.DataStudent;
import org.home_work5.service.DataTeacher;
import org.home_work5.view.StudentView;
import org.home_work5.view.TeacherView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private final DataStudent dataStudent;
    private final DataTeacher dataTeacher;
    private final DataStudyGroup dataStudyGroup;
    private final StudentView studentView;
    private final TeacherView teacherView;
    private final StudyGroupView studyGroupView;

    public void start() {
        User u1 = new Student(21, "Юрий", 4.5);
        User u2 = new Teacher(45, "Василий", "Math");
        User u3 = new Student(22, "Андрей", 4.5);
        User u4 = new Student(22, "Аввакум", 4.8);
        User u5 = new Teacher(42, "Васисуалий", "God's law");
        createStudent(u1);
        createTeacher(u2);
        createStudent(u3);
        createStudent(u4);
        createTeacher(u5);

        StudyGroup sg1 = new StudyGroup(
                (Teacher) u5,
                new ArrayList<>(Arrays.asList((Student) u1, (Student) u4)));
        createStudyGroup(sg1);

        List<Student> studentList = dataStudent.read();
        List<Teacher> teacherList = dataTeacher.read();
        List<StudyGroup> studyGroupList = dataStudyGroup.read();
        List<Integer> allGroupMembersIdList =
                dataStudyGroup.readAllGroupMembersId(sg1);

        studentView.printListStudents(studentList);
        teacherView.printListTeachers(teacherList);
        studyGroupView.printListStudyGroups(studyGroupList);
        studyGroupView.printAllGroupMembersId(allGroupMembersIdList);
    }

    public void createStudent(User student) {
        dataStudent.create(student);
    }

    public void createTeacher(User teacher) {
        dataTeacher.create(teacher);
    }

    public void createStudyGroup(StudyGroup studyGroup) {
        dataStudyGroup.create(studyGroup);
    }

    public Controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        dataStudyGroup = new DataStudyGroup();
        studentView = new StudentView();
        teacherView = new TeacherView();
        studyGroupView = new StudyGroupView();
    }
}
