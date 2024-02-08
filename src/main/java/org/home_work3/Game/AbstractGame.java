package org.home_work3.Game;


import org.home_work3.Game.GameType.GameType;
import org.home_work3.Service.Answer;
import org.home_work3.Service.Logger;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    protected abstract List<Character> generateCharList();
    private String word;
    private Integer wordSize;
    private static Integer startTryCount;
    private Integer tryCount;
    private GameStatus gameStatus = GameStatus.INIT;
    private GameType gameType = GameType.NUMBERS;
    private final Logger logger = new Logger();

    @Override
    public void start(Integer wordSize, Integer tryCount, GameType gameType) {
        startTryCount = tryCount;
        this.tryCount = startTryCount;
        this.wordSize = wordSize;
        this.gameType = gameType;
        word = generateWord(wordSize);

        String startMessage = "Запущена игра. Длина слова: " + this.wordSize +
                ", количество попыток: " + this.tryCount +
                ", тип игры: " + this.gameType.getType() + ".\n";
        if (!gameType.equals(GameType.NUMBERS)) {
            startMessage += "Слова загадываются в верхнем регистре!\n";}

        System.out.println(startMessage);
        this.logger.addNote(startMessage);

        gameStatus = GameStatus.START;
    }

    public void restart() {
        this.tryCount = startTryCount;
        gameStatus = GameStatus.RESTART;
        logger.addNote("Произведён рестарт");
        System.out.println("Загадано новое выражение");
        word = generateWord(this.wordSize);
    }

    public void exit() {
        gameStatus = GameStatus.EXIT;
        logger.addNote("Игра окончена");
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
    public Answer inputValue(String value) {
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
        logger.addNote("Игрок ввёл: " + value +
                ", осталость попыток:" + this.tryCount);
        if (tryCount == 0) {
            gameStatus = GameStatus.LOSE;
            logger.addNote("Игрок проиграл. Правильным словом было: " + this.word);
        }
        if (bullCounter == word.length()){
            gameStatus = GameStatus.WIN;
            logger.addNote("Игрок выиграл. Правильным словом было: " + this.word);
        }

        return new Answer(cowCounter, bullCounter, tryCount, gameStatus, word);
    }

    public void getLoggerHistory() {
        this.logger.showHistory();
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
