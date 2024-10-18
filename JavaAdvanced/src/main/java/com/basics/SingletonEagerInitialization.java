package com.basics;

public class SingletonEagerInitialization {
    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {
        // private constructor to prevent instantiation
    }

    public static SingletonEagerInitialization getInstance() {
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        SingletonEagerInitialization singleton = SingletonEagerInitialization.getInstance();
        System.out.println(singleton);
    }
}
