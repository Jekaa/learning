package ru.patterns.creational.builder;

public class ComplexObject {
    private Type type;
    private String name;
    private Integer value;
    private Double multipler;

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

    public Double getMultipler() {
        return multipler;
    }

    protected void setMultipler(Double multipler) {
        this.multipler = multipler;
    }

    public enum Type {
        FREE,
        BUSY
    }
}
