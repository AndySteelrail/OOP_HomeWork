package org.home_work3.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final List<String> logs = new ArrayList<>();
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void addNote(String message) {
        LocalDateTime currentTime = LocalDateTime.now();
        String formattedTime = currentTime.format(formatter);
        String formattedMessage = "[" + formattedTime + "] " + message;
        logs.add(formattedMessage);
    }

    public void showHistory() {
        System.out.println("История действий:");
        for (String message : logs) {
            System.out.println(message);
        }
    }
}
