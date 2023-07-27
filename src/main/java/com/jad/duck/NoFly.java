package com.jad.duck;

public class NoFly implements BehaviorFly{
    @Override
    public String fly() {
        return "Je ne vole pas";
    }
}
