package com.basics;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
        // private constructor to prevent instantiation
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
        System.out.println(singleton);
    }
}
