package com.jad.coffecup;

public abstract class Cup<E extends Liquid> {
    private E liquid;

    public E getLiquid() {
        return this.liquid;
    }

    public void setLiquid(final E liquid) {
        this.liquid = liquid;
    }

}
