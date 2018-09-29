package ru.patterns.behavioral.strategy;

public class StrategyImplSub implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
