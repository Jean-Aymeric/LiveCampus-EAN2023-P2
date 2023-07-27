package com.jad.duck;

public class Mallard extends Duck {
    public Mallard(String name) {
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
