package com.jad.duck;

import java.util.ArrayList;

public class HenHouse {
    private final ArrayList<Duck> ducks = new ArrayList<>();

    public void addDuck(final Duck duck) {
        this.ducks.add(duck);
    }

    public void singAll() {
        for(final Duck duck : this.ducks) {
            duck.sing();
        }
    }

    public void flyAll() {
        for(final Duck duck : this.ducks) {
            duck.fly();
        }
    }
}
