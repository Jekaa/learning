package ru.pattern.creational.factorymethod;

public class ConcreteCreatorA implements Creator {
    @Override
    public Product factoryMethod() {
        return new ProductImplA();
    }
}
