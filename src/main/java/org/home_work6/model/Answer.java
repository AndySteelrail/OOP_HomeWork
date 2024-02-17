package org.home_work6.model;


public class Answer {
    private final int cowCounter;
    private final int bullCounter;
    private final Integer tryCount;
    private final GameStatus gameStatus;
    private final String rightWord;

    public Answer(int cowCounter, int bullCounter, Integer tryCount, GameStatus gameStatus, String rightWord) {
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
    public Integer getTryCount() {
        return tryCount;
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }
    public String getRightWord() {
        return rightWord;
    }
}
