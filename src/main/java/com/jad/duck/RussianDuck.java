package com.jad.duck;

public class RussianDuck extends Duck {
    public RussianDuck(String name) {
        super(name, new Fly());
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Koin Koin");
    }


}
