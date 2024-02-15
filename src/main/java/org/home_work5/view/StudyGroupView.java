package org.home_work5.view;

import org.home_work5.model.Student;
import org.home_work5.model.StudyGroup;
import org.seminar5.model.Teacher;

import java.util.List;

public class StudyGroupView {
    public void printListStudyGroups(List<StudyGroup> listStudyGroup) {
        System.out.println("Учебная группа: \n" + listStudyGroup);
    }
}
