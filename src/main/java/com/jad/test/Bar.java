package com.jad.test;

public class Bar extends Foo {
    @Override
    public void doSomethingElse() {
        System.out.println("Je fais un autre truc, mais je le fais différemment");
        this.testDoSomething();
    }
}
