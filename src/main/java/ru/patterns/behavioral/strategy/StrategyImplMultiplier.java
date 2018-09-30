package ru.patterns.behavioral.strategy;

public class StrategyImplMultiplier implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
