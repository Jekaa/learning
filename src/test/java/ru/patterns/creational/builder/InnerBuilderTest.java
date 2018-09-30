package ru.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;
import ru.patterns.creational.builder.inner.ComplexObject;

import java.util.Optional;

public class InnerBuilderTest {
    @Test
    public void useInnerBuilder() {
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
}
