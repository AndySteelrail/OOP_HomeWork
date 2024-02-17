package org.home_work6.model.GameType;

public enum GameType {
    NUMBERS("числа"),
    CYRILLIC("кириллические буквы"),
    LATIN("латинские буквы");
    private final String type;
    GameType(String type) {
        this.type = type;
    }
    public String getType() {return type;}
}
