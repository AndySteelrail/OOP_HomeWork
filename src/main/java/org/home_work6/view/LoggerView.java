package org.home_work6.view;

import java.util.List;

public class LoggerView {
    public void printLogs (List<String> logs) {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
