package org.home_work3.Game.GameType;

import org.home_work3.Game.AbstractGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberCharGame extends AbstractGame {
    @Override
    protected List<Character> generateCharList() {

        return new ArrayList<>(
                Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
    }
}
