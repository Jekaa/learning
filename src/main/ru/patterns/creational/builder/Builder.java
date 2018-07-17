package ru.patterns.creational.builder;

public interface Builder {
    ComplexObject build();

    Builder type(final ComplexObject.Type type);

    Builder name(final String name);

    Builder value(final Integer value);

    Builder multipler(final Double multipler);
}
