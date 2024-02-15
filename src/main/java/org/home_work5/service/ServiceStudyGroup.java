package org.home_work5.service;

import org.home_work5.model.StudyGroup;
import java.util.List;


public interface ServiceStudyGroup {
    StudyGroup create(StudyGroup studyGroup);
    List<StudyGroup> read();
    List<Integer> readAllGroupMembersId(StudyGroup studyGroup);
}
