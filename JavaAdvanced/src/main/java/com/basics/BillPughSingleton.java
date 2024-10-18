package com.basics;

public class BillPughSingleton {

    private BillPughSingleton() {
        // private constructor to prevent instantiation
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton singleton = BillPughSingleton.getInstance();
        System.out.println(singleton);
    }
}
