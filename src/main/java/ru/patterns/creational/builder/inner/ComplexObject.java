package ru.patterns.creational.builder.inner;

/**
 * class with inner builder-class implements builder pattern
 */
class ComplexObject {
    private final Type type;
    private final String name;
    private final Integer value;
    private final Double multiplier;

    private ComplexObject(Builder builder) {
        this.type = builder.type;
        this.name = builder.name;
        this.value = builder.value;
        this.multiplier = builder.multiplier;
    }

    Type getType() {
        return type;
    }

    String getName() {
        return name;
    }

    Integer getValue() {
        return value;
    }

    Double getMultiplier() {
        return multiplier;
    }

    public enum Type {
        FREE
    }

    static class Builder {
        private Type type;
        private String name;
        private Integer value;
        private Double multiplier;

        Builder type(Type type) {
            this.type = type;
            return this;
        }

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder value(Integer value) {
            this.value = value;
            return this;
        }

        Builder multiplier(Double multiplier) {
            this.multiplier = multiplier;
            return this;
        }

        ComplexObject build() {
            return new ComplexObject(this);
        }
    }
}
