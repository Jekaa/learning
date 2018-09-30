package ru.patterns.creational.builder.outer;

/*

 */
public interface Builder {
    ComplexObject build();

    /**
     * set type parameter
     * @param type тип
     * @return builder
     */
    Builder type(final ComplexObject.Type type);

    /**
     * set name parameter
     * @param name имя
     * @return builder
     */
    Builder name(final String name);

    /**
     * set value parameter
     * @param value значение
     * @return builder
     */
    Builder value(final Long value);

    /**
     * set multiplier parameter
     * @param multiplier множитель
     * @return builder
     */
    Builder multiplier(final Double multiplier);
}
