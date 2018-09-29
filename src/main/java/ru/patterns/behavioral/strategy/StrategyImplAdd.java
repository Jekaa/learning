package ru.patterns.behavioral.strategy;

public class StrategyImplAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
