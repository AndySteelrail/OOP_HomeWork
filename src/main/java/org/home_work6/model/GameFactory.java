package org.home_work6.model;

import org.home_work6.model.GameType.CyrillicCharGame;
import org.home_work6.model.GameType.GameType;
import org.home_work6.model.GameType.LatinCharGame;
import org.home_work6.model.GameType.NumberCharGame;

public abstract class GameFactory {
    public static AbstractGame create(GameType type) {
        switch (type) {
            case GameType.CYRILLIC -> {
                return new CyrillicCharGame();
            }
            case GameType.LATIN -> {
                return new LatinCharGame();
            }
            default -> {
                return new NumberCharGame();
            }
        }
    }
}