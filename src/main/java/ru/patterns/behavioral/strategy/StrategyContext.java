package ru.patterns.behavioral.strategy;

public class StrategyContext {
    private Strategy strategy;

    public StrategyContext() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
