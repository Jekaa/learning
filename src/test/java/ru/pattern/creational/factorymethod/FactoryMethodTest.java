package ru.pattern.creational.factorymethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryMethodTest {

    private Creator[] creators;

    @Before
    public void init() {
        creators = new Creator[]{new ConcreteCreatorA(), new ConcreteCreatorB()};
    }

    @Test
    public void useFactoryMethod() {
        Product productA = creators[0].factoryMethod();
        Product productB = creators[1].factoryMethod();

        Assert.assertNotEquals(productA, productB);
        Assert.assertTrue(productA instanceof ProductImplA);
        Assert.assertTrue(productB instanceof ProductImplB);
    }
}
