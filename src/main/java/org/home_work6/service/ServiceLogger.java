package org.home_work6.service;

import java.util.List;

public interface ServiceLogger {
    void addNote(String message);

    List<String> getLogs();
}
