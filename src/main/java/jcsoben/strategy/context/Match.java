package jcsoben.strategy.context;

import jcsoben.strategy.strategy.Strategy;

public class Match {

    private final Strategy strategy;

    public Match(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.action();
    }
}
