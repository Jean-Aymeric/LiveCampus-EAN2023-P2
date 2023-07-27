package com.jad.duck;

public abstract class Duck {
    private BehaviorFly behaviorFly;
    public String getName() {
        return this.name;
    }

    private final String name;

    public Duck(final String name, final BehaviorFly behaviorFly) {
        this.name = name;
        this.behaviorFly = behaviorFly;
    }

    public abstract void sing();

    public final void fly() {
        System.out.println(this.getName()  + " : " + this.behaviorFly.fly());
    }

    public BehaviorFly getBehaviorFly() {
        return this.behaviorFly;
    }

    public void setBehaviorFly(final BehaviorFly behaviorFly) {
        this.behaviorFly = behaviorFly;
    }
}
