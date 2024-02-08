package org.home_work3.Game;

import org.home_work3.Game.GameType.GameType;
import org.home_work3.Service.Answer;

public interface Game {
    void start(Integer wordSize, Integer tryCount, GameType gameType);
    void restart();
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
