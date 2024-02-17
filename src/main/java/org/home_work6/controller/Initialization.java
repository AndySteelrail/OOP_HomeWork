package org.home_work6.controller;

import org.home_work6.model.GameType.GameType;
import org.home_work6.view.InitializationView;

import java.util.Scanner;

public class Initialization {
    private final int worldSize;
    private final int tryCount;
    private final GameType gameType;

    public Initialization(Scanner sc) {

        InitializationView.printSetStartMessage();
        InitializationView.requestWorldSize();
        worldSize = sc.nextInt();
        InitializationView.requestTryCount();
        tryCount = sc.nextInt();
        sc.nextLine();
        InitializationView.requestGameType();
        String inputGameType = sc.nextLine();

        switch (inputGameType) {
            case "C": {
                this.gameType = GameType.CYRILLIC;
                break;
            }
            case "L": {
                this.gameType = GameType.LATIN;
                break;
            }
            default: this.gameType = GameType.NUMBERS;
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
