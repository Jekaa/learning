package ru.patterns.creational.builder.outer;

public class ComplexObject {
    private Type type;
    private String name;
    private Integer value;
    private Double multiplier;

    public Type getType() {
        return type;
    }

    protected void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    protected void setValue(Integer value) {
        this.value = value;
    }

    public Double getMultiplier() {
        return multiplier;
    }

    protected void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

    public enum Type {
        FREE,
        BUSY
    }
}
