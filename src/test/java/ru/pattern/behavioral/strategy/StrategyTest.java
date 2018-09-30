package ru.pattern.behavioral.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StrategyTest {
    private StrategyContext context;

    @Before
    public void init() {
        context = new StrategyContext();
    }

    @Test
    public void strategyAddTest() {
        context.setStrategy(new StrategyImplAdd());
        int resultA = context.executeStrategy(1, 2);
        Assert.assertEquals(3, resultA);
    }

    @Test
    public void strategySubTest() {
        context.setStrategy(new StrategyImplSub());
        int resultB = context.executeStrategy(3, 4);
        Assert.assertEquals(-1, resultB);
    }

    @Test
    public void strategyMultiplierTest() {
        context.setStrategy(new StrategyImplMultiplier());
        int resultC = context.executeStrategy(5, 6);
        Assert.assertEquals(30, resultC);
    }


}
