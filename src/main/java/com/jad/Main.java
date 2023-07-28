package com.jad;

import com.jad.coffecup.*;


public class Main {
    public static void main(final String[] args) {
        final CoffeeCup coffeeCup = new CoffeeCup();
        final TeaCup teaCup = new TeaCup();

        coffeeCup.setLiquid(new Coffee());
        teaCup.setLiquid(new Tea());
        coffeeCup.setLiquid(new Deca()); // normalement, il devrait y avoir une erreur
    }
}
