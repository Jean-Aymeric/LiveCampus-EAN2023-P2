package com.jad.test;

public enum Color {
    RED("Rouge"), WHITE("Blanc"), BLACK("Noir");

    private String name;

    Color(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
