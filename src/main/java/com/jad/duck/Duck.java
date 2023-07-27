package com.jad.duck;

public abstract class Duck {
    public String getName() {
        return this.name;
    }

    private final String name;

    public Duck(final String name) {
        this.name = name;
    }

    public abstract void sing();

    public abstract void fly();
}
