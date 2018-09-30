package ru.patterns.behavioral.strategy;

class StrategyContext {
    private Strategy strategy;

    StrategyContext() {
    }

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
