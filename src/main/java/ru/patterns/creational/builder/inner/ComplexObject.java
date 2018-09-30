package ru.patterns.creational.builder.inner;

/**
 * class with inner builder-class implements builder pattern
 */
public class ComplexObject {
    private final Type type;
    private final String name;
    private final Long value;
    private final Double multiplier;

    private ComplexObject(Builder builder) {
        this.type = builder.type;
        this.name = builder.name;
        this.value = builder.value;
        this.multiplier = builder.multiplier;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Long getValue() {
        return value;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    public enum Type {
        FREE,
        BUSY
    }

    public static class Builder {
        private Type type;
        private String name;
        private Long value;
        private Double multiplier;

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder value(Long value) {
            this.value = value;
            return this;
        }

        public Builder multiplier(Double multiplier) {
            this.multiplier = multiplier;
            return this;
        }

        public ComplexObject build() {
            return new ComplexObject(this);
        }
    }
}
