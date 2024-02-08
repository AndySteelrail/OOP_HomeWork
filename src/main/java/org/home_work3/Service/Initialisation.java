package org.home_work3.Service;

import org.home_work3.Game.GameType.GameType;

import java.util.Scanner;

public class Initialisation {
    private final int worldSize;
    private final int tryCount;
    private final GameType gameType;
    public Initialisation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Для игры быки и коровы, введите стартовые настройки:");
        System.out.println("Введите длину слова:");
        this.worldSize = sc.nextInt();
        System.out.println("Введите количество попыток:");
        this.tryCount = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите режим игры, с учётом регистра,\n" +
                "где C - кириллическое слово, L - латиница, " +
                "а также числа во всех остальных случаях"
        );
        String inputGameType = sc.nextLine();
        switch (inputGameType) {
            case "C":
                this.gameType = GameType.CYRILLIC;
                break;
            case "L":
                this.gameType = GameType.LATIN;
                break;
            default:
                this.gameType = GameType.NUMBERS;
        }
    }

    public int getWorldSize() {
        return worldSize;
    }

    public int getTryCount() {
        return tryCount;
    }

    public GameType getGameType() {
        return gameType;
    }
}
