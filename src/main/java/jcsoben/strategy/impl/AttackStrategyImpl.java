package jcsoben.strategy.impl;

import jcsoben.strategy.strategy.Strategy;

public class AttackStrategyImpl implements Strategy {
    @Override
    public void action() {
        System.out.println("We should attack or we gonna lose");
    }
}
