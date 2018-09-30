package ru.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class BuilderTest {

    private ComplexObject object;

    @Before
    public void init() {
        object = new ComplexObject.Builder()
                .type(ComplexObject.Type.FREE)
                .name("name")
                .value(1000L)
                .multiplier(2.99)
                .build();
    }

    @Test
    public void useBuilder() {
        Assert.assertNotNull(object);
        Assert.assertEquals(ComplexObject.Type.FREE, object.getType());
        Assert.assertEquals("name", object.getName());
        Assert.assertEquals(Optional.of(1000L), Optional.of(object.getValue()));
        Assert.assertEquals(Optional.of(2.99), Optional.of(object.getMultiplier()));
    }

    @Test
    public void secondObjectNotEquals() {
        ComplexObject object2 = new ComplexObject.Builder()
                .type(ComplexObject.Type.BUSY)
                .name("name")
                .value(1000L)
                .multiplier(2.99)
                .build();

        ComplexObject object3 = new ComplexObject.Builder()
                .type(ComplexObject.Type.BUSY)
                .name("name")
                .value(1000L)
                .multiplier(2.99)
                .build();

        Assert.assertNotEquals(object2, object3);
    }
}
