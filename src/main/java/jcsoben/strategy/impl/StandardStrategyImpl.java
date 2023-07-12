package jcsoben.strategy.impl;

import jcsoben.strategy.strategy.Strategy;

public class StandardStrategyImpl implements Strategy {

    @Override
    public void action() {
        System.out.println("Keep going like that");
    }
}
