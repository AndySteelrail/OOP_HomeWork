package org.home_work6.view;


public abstract class GameEventView {
    public static void printStartGameMessage(int wordSize, int tryCount, String gameType) {
        String startMessage = "Запущена игра. Длина слова: " + wordSize +
                ", количество попыток: " + tryCount +
                ", тип игры: " + gameType + ".\n";
        if (!gameType.equals("числа")) {
            startMessage += "Слова загадываются в верхнем регистре!\n";}

        System.out.println(startMessage);
    }

    public static void printNewAttemptMessage() {
        System.out.println("Введите новое значение, либо " +
                "'s' для просмотра статистики, " +
                "'r' - для рестарта игры, " +
                "'e' - для выхода"
        );
    }

    public static void printResultOfAttemptMessage(
            int cowCounter,
            int bullCounter,
            Integer tryCount,
            String gameStatus,
            String rightWord
    ) {
        String message = "Коров: " + cowCounter + ", " +
                "быков: " + bullCounter + ", " +
                "осталось попыток: " + tryCount;
        if (gameStatus.equals("win")) {
            message += "\nИгрок выиграл. Правильным словом было: " + rightWord + "\n";
        }
        if (gameStatus.equals("lose")) {
            message += "\nИгрок проиграл. Правильным словом было: " + rightWord + "\n";
        }

        System.out.println(message);
    }

    public static void printExitGameMessage() {
        System.out.println("Игра окончена");
    }

    public static void printRestartGameMessage() {System.out.println("Произведён рестарт. Загадано новое выражение");};


}
