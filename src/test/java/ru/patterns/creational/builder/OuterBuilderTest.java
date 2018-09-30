package ru.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.patterns.creational.builder.outer.BuilderImpl;
import ru.patterns.creational.builder.outer.ComplexObject;

import java.util.Optional;

public class OuterBuilderTest {
    private BuilderImpl objectBuilder;
    private ComplexObject object;

    @Before
    public void init() {
        objectBuilder = new BuilderImpl();
        object = objectBuilder.type(ComplexObject.Type.BUSY)
                .name("Object1")
                .value(1000L)
                .multiplier(2.0)
                .build();
    }

    @Test
    public void useOuterBuilder() {
        Assert.assertNotNull(object);
        Assert.assertEquals(ComplexObject.Type.BUSY, object.getType());
        Assert.assertEquals("Object1", object.getName());
        Assert.assertEquals(Optional.of(1000L), Optional.of(object.getValue()));
        Assert.assertEquals(Optional.of(2.0), Optional.of((object.getMultiplier())));
    }
}
