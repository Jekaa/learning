package ru.patterns.creational.builder.outer;

public class ComplexObject {
    private Type type;
    private String name;
    private Long value;
    private Double multiplier;

    public Type getType() {
        return type;
    }

    void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    void setValue(Long value) {
        this.value = value;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

    public enum Type {
        FREE,
        BUSY
    }
}
