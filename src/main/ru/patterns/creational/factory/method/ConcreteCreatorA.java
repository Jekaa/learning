package ru.patterns.creational.factory.method;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductImplA();
    }
}
