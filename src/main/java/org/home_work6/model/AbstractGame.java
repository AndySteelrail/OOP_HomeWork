package org.home_work6.model;


import org.home_work6.model.GameType.GameType;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game, GameManage {
    protected abstract List<Character> generateCharList();
    private String word;
    private int wordSize;
    private static int startTryCount;
    private int tryCount;
    private GameStatus gameStatus = GameStatus.INIT;
    private GameType gameType = GameType.NUMBERS;

    @Override
    public void start(int wordSize, int tryCount, GameType gameType) {
        startTryCount = tryCount;
        this.tryCount = startTryCount;
        this.wordSize = wordSize;
        this.gameType = gameType;
        word = generateWord(wordSize);
        gameStatus = GameStatus.START;
    }

    public void restart() {
        this.tryCount = startTryCount;
        gameStatus = GameStatus.RESTART;
        word = generateWord(this.wordSize);
    }

    private String generateWord(Integer wordSize) {
        List<Character> alphabet = generateCharList();
        Random rnd = new Random();
        String result = "";
        for (int i = 0; i < wordSize; i++) {
            int randomIndex = rnd.nextInt(alphabet.size());
            result += alphabet.get(randomIndex);
            alphabet.remove(randomIndex);
        }
        return result;
    }

    @Override
    public AttemptResult attempt(String value) {
        if (!getGameStatus().equals(GameStatus.START) &&
                !getGameStatus().equals(GameStatus.RESTART)) {
            throw new RuntimeException("Игра не запущена");
        }
        int cowCounter = 0;
        int bullCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                cowCounter++;
                bullCounter++;
            } else if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++;
            }
        }

        tryCount--;
        if (tryCount == 0) {gameStatus = GameStatus.LOSE;}
        if (bullCounter == word.length()){gameStatus = GameStatus.WIN;}

        return new AttemptResult(cowCounter, bullCounter, tryCount, gameStatus, word);
    }

    @Override
    public void exit() {
        gameStatus = GameStatus.EXIT;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
