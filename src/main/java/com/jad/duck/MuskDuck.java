package com.jad.duck;

public class MuskDuck extends Duck {
    public MuskDuck(String name) {
        super(name);
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Coin Coin");
    }

    @Override
    public void fly() {
        System.out.println(this.getName()  + " : Je vole");
    }
}
