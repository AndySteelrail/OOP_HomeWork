package org.home_work6.view;

import java.util.List;

public abstract class LoggerView {
    public static void printLogs (List<String> logs) {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
