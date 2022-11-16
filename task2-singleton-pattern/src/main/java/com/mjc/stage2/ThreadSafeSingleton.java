package com.mjc.stage2;

public class ThreadSafeSingleton {
    private final static ThreadSafeSingleton instance;

    static {
        instance = new ThreadSafeSingleton();
    }

    private ThreadSafeSingleton(){};

    public static ThreadSafeSingleton getInstance() {
        return instance;
    }
}
