package ru.patterns.creational.builder.inner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.patterns.creational.builder.outer.Builder;

class DemoBuilder {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(DemoBuilder.class);

        ComplexObject object = new ComplexObject.Builder()
                .type(ComplexObject.Type.FREE)
                .name("name")
                .value(1000)
                .multiplier(2.99)
                .build();

        logger.info("Type: " + object.getType());
        logger.info("Name: " + object.getName());
        logger.info("Value: " + object.getValue());
        logger.info("Multiplier: " + object.getMultiplier());
    }
}
