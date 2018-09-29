package ru.patterns.behavioral.strategy;

public class DemoStrategy {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext();

        context.setStrategy(new StrategyImplAdd());
        int resultA = context.executeStrategy(1, 2);

        context.setStrategy(new StrategyImplSub());
        int resultB = context.executeStrategy(3, 4);

        context.setStrategy(new StrategyImplMult());
        int resultC = context.executeStrategy(5, 6);

        System.out.println("Result A : " + resultA);
        System.out.println("Result B : " + resultB);
        System.out.println("Result C : " + resultC);
    }
}
