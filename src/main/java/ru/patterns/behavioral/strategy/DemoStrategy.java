package ru.patterns.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class DemoStrategy {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DemoStrategy.class);

        StrategyContext context = new StrategyContext();

        context.setStrategy(new StrategyImplAdd());
        int resultA = context.executeStrategy(1, 2);

        context.setStrategy(new StrategyImplSub());
        int resultB = context.executeStrategy(3, 4);

        context.setStrategy(new StrategyImplMultiplier());
        int resultC = context.executeStrategy(5, 6);

        logger.info("Result A : " + resultA);
        logger.info("Result B : " + resultB);
        logger.info("Result C : " + resultC);
    }
}
