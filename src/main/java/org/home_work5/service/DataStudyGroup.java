package org.home_work5.service;

import org.home_work5.model.StudyGroup;
import java.util.ArrayList;
import java.util.List;


public class DataStudyGroup implements ServiceStudyGroup{
    List<StudyGroup> listStudyGroup = new ArrayList<>();

    @Override
    public StudyGroup create(StudyGroup studyGroup) {
        studyGroup.setStudyGroupId(listStudyGroup.size() + 1);
        listStudyGroup.add(studyGroup);
        return studyGroup;
    }

    @Override
    public List<StudyGroup> read() {
        return listStudyGroup;
    }

    @Override
    public List<Integer> readAllGroupMembersId(StudyGroup studyGroup) {
        return studyGroup.getAllGroupMembersId();
    }
}
