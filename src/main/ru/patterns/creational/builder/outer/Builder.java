package ru.patterns.creational.builder.outer;

/*

 */
public interface Builder {
    ComplexObject build();

    /**
     * set type parameter
     * @param type
     * @return builder
     */
    Builder type(final ComplexObject.Type type);

    /**
     * set name parameter
     * @param name
     * @return builder
     */
    Builder name(final String name);

    /**
     * set value parameter
     * @param value
     * @return builder
     */
    Builder value(final Integer value);

    /**
     * set multiplier parameter
     * @param multiplier
     * @return builder
     */
    Builder multiplier(final Double multiplier);
}
