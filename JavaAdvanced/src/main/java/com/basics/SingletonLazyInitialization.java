package com.basics;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() {
        // private constructor to prevent instantiation
    }

    public static SingletonLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazyInitialization singleton = SingletonLazyInitialization.getInstance();
        System.out.println(singleton);
    }
}
