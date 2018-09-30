package ru.patterns.creational.factorymethod;

public class ConcreteCreatorB implements Creator {
    @Override
    public Product factoryMethod() {
        return new ProductImplB();
    }
}
