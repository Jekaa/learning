package ru.patterns.creational.builder.outer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class DemoBuilder {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DemoBuilder.class); 
        
        BuilderImpl builder = new BuilderImpl();
        ComplexObject object =
                builder.type(ComplexObject.Type.FREE)
                        .name("Object1")
                        .value(1000)
                        .multiplier(2.0)
                        .build();
        logger.info("Type: " + object.getType());
        logger.info("Name: " + object.getName());
        logger.info("Value: " + object.getValue());
        logger.info("Multiplier: " + object.getMultiplier());
    }
}
