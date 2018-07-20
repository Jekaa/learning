package ru.patterns.creational.factory.method;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductImplB();
    }
}
