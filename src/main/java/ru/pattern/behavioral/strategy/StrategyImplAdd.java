package ru.pattern.behavioral.strategy;

public class StrategyImplAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
