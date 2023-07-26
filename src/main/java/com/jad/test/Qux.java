package com.jad.test;

public class Qux {
    private static final int DEFAULT_ID = 1;
    private int id;

    public Qux() {
        this(Qux.DEFAULT_ID);
    }

    public Qux(final int id) {
        this.id = id;
    }

    public Qux(final Qux other) {
        this(other.id);
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }
}
