package ru.patterns.creational.builder.outer;

class DemoBuilder {
    public static void main(String[] args) {
        BuilderImpl builder = new BuilderImpl();
        ComplexObject object =
                builder.type(ComplexObject.Type.FREE)
                        .name("Object1")
                        .value(1000)
                        .multiplier(2.0)
                        .build();
        System.out.println(object.getType());
        System.out.println(object.getName());
        System.out.println(object.getValue());
        System.out.println(object.getMultiplier());
    }
}
