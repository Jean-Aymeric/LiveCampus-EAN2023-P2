package com.jad.duck;

public class MuskDuck extends Duck {
    public MuskDuck(String name) {
        super(name, new Fly());
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Coin Coin");
    }

}
