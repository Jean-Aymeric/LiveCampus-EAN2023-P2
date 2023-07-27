package com.jad.duck;

public class PlasticDuck extends Duck {
    public PlasticDuck(String name) {
        super(name, new NoFly());
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Coin Coin");
    }

}
