package ru.patterns.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class DemoSingleton {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(DemoSingleton.class);

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        logger.info("Result : " + instance1.equals(instance2));
    }
}
