package ru.patterns.creational.builder;

public class BuilderImpl implements Builder {
    private ComplexObject object;

    public BuilderImpl() {
        this.object = new ComplexObject();
    }

    @Override
    public ComplexObject build() {
        return object;
    }

    @Override
    public Builder type(ComplexObject.Type type) {
        object.setType(type);
        return this;
    }

    @Override
    public Builder name(String name) {
        object.setName(name);
        return this;
    }

    @Override
    public Builder value(Integer value) {
        object.setValue(value);
        return this;
    }

    @Override
    public Builder multipler(Double multipler) {
        object.setMultipler(multipler);
        return this;
    }
}
