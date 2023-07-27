package com.jad.duck;

public class PlasticDuck extends Duck {
    public PlasticDuck(String name) {
        super(name);
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Coin Coin");
    }

    @Override
    public void fly() {
        System.out.println(this.getName()  + " : Je vole pas");
    }
}
