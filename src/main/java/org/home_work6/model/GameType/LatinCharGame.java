package org.home_work6.model.GameType;

import org.home_work6.model.AbstractGame;

import java.util.ArrayList;
import java.util.List;

public class LatinCharGame extends AbstractGame {
    @Override
    protected List<Character> generateCharList() {
        List<Character> latinAlphabet = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            latinAlphabet.add(c);
        }
        return latinAlphabet;
    }
}
