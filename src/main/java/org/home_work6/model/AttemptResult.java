package org.home_work6.model;


public class AttemptResult {
    private final int cowCounter;
    private final int bullCounter;
    private final int tryCount;
    private final GameStatus gameStatus;
    private final String rightWord;

    public AttemptResult(int cowCounter, int bullCounter, int tryCount, GameStatus gameStatus, String rightWord) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
        this.rightWord = rightWord;
        this.gameStatus = gameStatus;
    }

    public int getCowCounter() {
        return cowCounter;
    }
    public int getBullCounter() {
        return bullCounter;
    }
    public int getTryCount() {
        return tryCount;
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }
    public String getRightWord() {
        return rightWord;
    }
}
