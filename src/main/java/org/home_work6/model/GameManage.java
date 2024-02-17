package org.home_work6.model;

import org.home_work6.model.GameType.GameType;

public interface GameManage {
    void start(int wordSize, int tryCount, GameType gameType);
    void restart();
    void exit();
}