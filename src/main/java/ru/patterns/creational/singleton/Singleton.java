package ru.patterns.creational.singleton;

/**
 * The class implements Singleton pattern, thread-safe
 */
public final class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
