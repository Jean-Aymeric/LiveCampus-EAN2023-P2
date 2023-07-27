package com.jad.duck;

public class Mallard extends Duck {
    public Mallard(String name) {
        super(name, new Fly());
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Coin Coin");
    }

}
