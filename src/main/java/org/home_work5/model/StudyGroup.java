package org.home_work5.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private int studyGroupId;
    private final Teacher teacher;
    private final List<Student> studentList;

    public StudyGroup (Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public void setStudyGroupId(int studyGroupId) {
        this.studyGroupId = studyGroupId;
    }

    public List<Integer> getAllGroupMembersId() {
        List<Integer> allId = new ArrayList<>();
        allId.add(teacher.getTeacherId());
        for (Student student : studentList) {
            allId.add(student.getStudentId());
        }
        return allId;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder("StudyGroup {" +
                "studyGroupId = " + studyGroupId + ",\n\t" +
                teacher + ",");
        for (Student student : studentList) {
            message.append("\n\t");
            message.append(student.toString());
        }
        message.append("\n}");
        return message.toString();
    }
}
