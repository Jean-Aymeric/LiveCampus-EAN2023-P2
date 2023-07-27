package com.jad;

import com.jad.duck.*;


public class Main {
    public static void main(final String[] args) {
        final HenHouse henHouse = new HenHouse();
        henHouse.addDuck(new Mallard("Donald"));
        henHouse.addDuck(new Mallard("Daisy"));
        henHouse.addDuck(new GermanDuck("Elmut"));
        henHouse.addDuck(new MuskDuck("Conan"));

        henHouse.singAll();
    }
}
