package com.jad.duck;

public class GermanDuck extends Duck {
    public GermanDuck(String name) {
        super(name, new Fly());
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Koin Koin");
    }

}
