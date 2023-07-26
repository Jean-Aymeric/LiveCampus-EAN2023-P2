package com.jad;

import com.jad.relation.Human;
import com.jad.relation.Shirt;
import com.jad.test.*;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        Human jad = new Human();
        Human gaspard = new Human();
        jad.wear(new Shirt());
        gaspard.transplant(jad.popOrgan());
        System.out.println("coucou");
    }
}
