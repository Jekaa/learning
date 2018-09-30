package ru.patterns.creational.builder.outer;

class ComplexObject {
    private Type type;
    private String name;
    private Integer value;
    private Double multiplier;

    Type getType() {
        return type;
    }

    void setType(Type type) {
        this.type = type;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getValue() {
        return value;
    }

    void setValue(Integer value) {
        this.value = value;
    }

    Double getMultiplier() {
        return multiplier;
    }

    void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

    public enum Type {
        FREE
    }
}
