package org.home_work6.controller;


import org.home_work6.model.AbstractGame;
import org.home_work6.model.Answer;
import org.home_work6.model.GameFactory;
import org.home_work6.model.GameStatus;
import org.home_work6.model.GameType.GameType;
import org.home_work6.service.Logger;
import org.home_work6.view.GameEventView;
import org.home_work6.view.LoggerView;

import java.util.Scanner;

public class Controller {
    Scanner sc;
    private final Logger logger = new Logger();
    private AbstractGame game;
    private final GameEventView gameEventView = new GameEventView();
    private final LoggerView loggerView = new LoggerView();

    public void start() {
        sc = new Scanner(System.in);
        Initialization init = new Initialization(sc);

        game = GameFactory.createGame(init.getGameType());
        startGame(init);

        while (!game.getGameStatus().equals(GameStatus.EXIT)) {
            gameEventView.printNewAttemptMessage();

            String userInput = sc.nextLine();
            if (userInput.equals("s")) {
                getLoggerHistory();
                continue;
            }
            if (userInput.equals("r")) {
                restartGame();
                continue;
            }
            if (userInput.equals("e")) {
                exitGame();
                continue;
            }

            attempt(userInput);

            if (game.getGameStatus().equals(GameStatus.WIN) ||
                    game.getGameStatus().equals(GameStatus.LOSE)) {
                restartGame();
            }
        }
    }

    public void exit() {
        sc.close();
    }

    public void startGame(Initialization init) {
        int wordSize = init.getWorldSize();
        int tryCount = init.getTryCount();
        GameType gameType = init.getGameType();
        String gameTypeName = gameType.getType();

        game.start(wordSize, tryCount, gameType);
        logger.addStartGameNote(wordSize, tryCount, gameTypeName);
        gameEventView.printStartGameMessage(wordSize, tryCount, gameTypeName);
    }

    public void attempt(String userInput) {
        Answer answer = game.attempt(userInput);
        logger.addAttemptNote(
                userInput,
                answer.getTryCount(),
                answer.getGameStatus().getCode(),
                answer.getRightWord()
        );
        gameEventView.printResultOfAttemptMessage(
                answer.getCowCounter(),
                answer.getBullCounter(),
                answer.getTryCount(),
                answer.getGameStatus().getCode(),
                answer.getRightWord()
        );
    }

    public void exitGame() {
        game.exit();
        logger.addExitGameNote();
        gameEventView.printExitGameMessage();
    }

    public void restartGame() {
        game.restart();
        logger.addRestartGameNote();
        gameEventView.printRestartGameMessage();
    }

    public void getLoggerHistory() {
        loggerView.printLogs(
                logger.getLogs());
    }
}
