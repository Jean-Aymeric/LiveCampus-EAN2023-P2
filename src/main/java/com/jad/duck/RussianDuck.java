package com.jad.duck;

public class RussianDuck extends Duck {
    public RussianDuck(String name) {
        super(name);
    }

    @Override
    public void sing()  {
        System.out.println(this.getName()  + " : Koin Koin");
    }

    @Override
    public void fly() {
        System.out.println(this.getName()  + " : Je vole");
    }
}
