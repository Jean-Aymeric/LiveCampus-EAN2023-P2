package com.jad;

import com.jad.duck.*;


public class Main {
    public static void main(final String[] args) {
        final HenHouse henHouse = new HenHouse();
        Duck donald = new Mallard("Donald");
        henHouse.addDuck(donald);
        Duck daisy = new Mallard("Daisy");
        henHouse.addDuck(daisy);
        henHouse.addDuck(new GermanDuck("Elmut"));
        henHouse.addDuck(new MuskDuck("Conan"));
        Duck roger = new PlasticDuck("Roger");
        henHouse.addDuck(roger);
        henHouse.addDuck(new Duck("Super Canard", new BehaviorFly() {
            @Override
            public String fly() {
                return "Je vole comme un avion supersonique";
            }
        }) {
            @Override
            public void sing() {
                System.out.println("BOUM");
            }
        });

        henHouse.flyAll();
        // Roger rencontre une fée et il fait le vœu de pouvoir voler.
        roger.setBehaviorFly(() -> "Je vole avec une cape magique");
        donald.setBehaviorFly(roger.getBehaviorFly());
        donald.setBehaviorFly(daisy.getBehaviorFly());
        henHouse.flyAll();
    }
}
