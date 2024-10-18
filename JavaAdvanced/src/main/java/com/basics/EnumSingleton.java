package com.basics;

public enum EnumSingleton {
        INSTANCE;

        public void someMethod() {
            // Method logic
        }
    }

    class MainClass {
        public static void main(String[] args) {
            EnumSingleton singleton = EnumSingleton.INSTANCE;
            singleton.someMethod();
            System.out.println(singleton);
        }
    }

