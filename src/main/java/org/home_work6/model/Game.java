package org.home_work6.model;

import org.home_work6.model.GameType.GameType;

public interface Game{
    void start(int wordSize, int tryCount, GameType gameType);
    void restart();
    void exit();
    AttemptResult attempt(String value);
    GameStatus getGameStatus();
}