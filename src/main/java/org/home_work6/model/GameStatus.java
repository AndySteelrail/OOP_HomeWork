package org.home_work6.model;

public enum GameStatus {
    INIT("init"),
    START("start"),
    RESTART("restart"),
    LOSE("lose"),
    WIN("win"),
    EXIT("exit");
    private final String code;
    GameStatus(String code) {
        this.code = code;
    }
    public String getCode(){ return code;}
}
