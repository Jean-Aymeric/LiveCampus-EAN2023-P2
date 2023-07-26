package com.jad.relation;

import java.util.ArrayList;

public class Human {
    private ArrayList<Organ> organs = new ArrayList<>();
    private ArrayList<Clothe> clothes = new ArrayList<>();
    private ArrayList<Organ> grafts = new ArrayList<>();
    public Human() {
        this.organs.add(new Heart());
    }

    public void wear(Clothe clothe) {
        this.clothes.add(clothe);
    }

    public void takeOff(Clothe clothe) {
        this.clothes.remove(clothe);
    }

    public void transplant(Organ organ) {
        this.grafts.add(organ);
    }

    public Organ popOrgan() {
        if (this.organs.size() == 0) {
            return null;
        }
        Organ popedOrgan = this.organs.get(0);
        this.organs.remove(0);
        return popedOrgan;
    }
}
