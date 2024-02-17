package org.home_work6.model.GameType;

import org.home_work6.model.AbstractGame;

import java.util.ArrayList;
import java.util.List;

public class CyrillicCharGame extends AbstractGame {
    @Override
    protected List<Character> generateCharList() {
        List<Character> russianAlphabet = new ArrayList<>();
        for (char c = 'А'; c <= 'Я'; c++) {
            russianAlphabet.add(c);
        }
        russianAlphabet.add('Ё');
        return russianAlphabet;
    }
}
