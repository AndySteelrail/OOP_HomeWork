package org.home_work6.service;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Logger implements ServiceLogger{
    private static final ArrayList<String> logs = new ArrayList<>();
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void addNote(String message) {
        String formattedMessage = "[" + formattedTimeNow() + "] " + message;
        logs.add(formattedMessage);
    }

    public void addStartGameNote(int wordSize, int tryCount, String gameType) {
        String message = "Запущена игра. Длина слова: " + wordSize +
                ", количество попыток: " + tryCount +
                ", тип игры: " + gameType + ".";
        addNote(message);
    }

    public void addAttemptNote(String userInput, int tryCount, String gameStatus, String rightWord) {
        String message = "Игрок ввёл: " + userInput + ", осталось попыток:" + tryCount;
        if (gameStatus.equals("lose")) {
            message += "\nИгрок проиграл. Правильным словом было: " + rightWord;
        }
        if (gameStatus.equals("win")){
            message += "\nИгрок выиграл. Правильным словом было: " + rightWord;
        }
        addNote(message);
    }

    public void addExitGameNote() {
        addNote("Игра окончена");
    }

    public void addRestartGameNote() {
        addNote("Произведён рестарт");
    }

    @Override
    public ArrayList<String> getLogs() {
        return logs;
    }

    private String formattedTimeNow() {
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.format(formatter);
    }
}
