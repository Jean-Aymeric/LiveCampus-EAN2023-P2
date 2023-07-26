package com.jad.test;

public abstract class Foo {
    private int aThing;

    public int getAThing() {
        return this.aThing;
    }

    public void setAThing(final int aThing) {
        this.aThing = aThing;
    }

    private void doSomeThing() {
        System.out.println("Je m'appelle" + this.getClass() + " et je fais un truc");
    }

    public abstract void doSomethingElse();

    public void testDoSomething() {
        this.doSomeThing();
    }

    void doAnotherThing() {
        System.out.println("Je fais encore un autre truc");
    }
}
