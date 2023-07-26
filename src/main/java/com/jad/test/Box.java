package com.jad.test;

public class Box<E> {
    private E content;

    public E getContent() {
        return this.content;
    }

    public void setContent(final E content) {
        this.content = content;
    }
}
