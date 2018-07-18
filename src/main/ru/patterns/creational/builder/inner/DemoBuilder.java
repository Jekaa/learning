package ru.patterns.creational.builder.inner;

public class DemoBuilder {
    public static void main(String[] args) {

        ComplexObject object = new ComplexObject.Builder()
                .type(ComplexObject.Type.FREE)
                .name("name")
                .value(1000)
                .multiplier(2.99)
                .build();

        System.out.println(object.getType());
        System.out.println(object.getName());
        System.out.println(object.getValue());
        System.out.println(object.getMultiplier());
    }
}
