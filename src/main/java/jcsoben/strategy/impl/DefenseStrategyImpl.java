package jcsoben.strategy.impl;

import jcsoben.strategy.strategy.Strategy;

public class DefenseStrategyImpl implements Strategy {
    @Override
    public void action() {
        System.out.println("It's ok, lets defend");
    }
}
