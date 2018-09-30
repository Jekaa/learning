package ru.pattern.creational.builder;

import org.junit.Assert;
import org.junit.Test;
import java.util.Optional;

public class BuilderTest {

    @Test
    public void useBuilder() {
        ComplexObject object = new ComplexObject.Builder()
                .type(ComplexObject.Type.FREE)
                .name("name")
                .value(1000L)
                .multiplier(2.99)
                .build();

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

    @Test
    public void buildEmpty() {
        ComplexObject object = new ComplexObject.Builder().build();
        Assert.assertNotNull(object);
        Assert.assertNull(object.getType());
        Assert.assertNull(object.getName());
        Assert.assertNull(object.getValue());
        Assert.assertNull(object.getMultiplier());
    }
}
